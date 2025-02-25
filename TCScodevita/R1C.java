
import java.util.*;

public class R1C {

    // Mapping of valid characters to their 7-segment display representation
    private static final Map<Character, String[]> segmentMap = new HashMap<>();

    static {
        segmentMap.put('0', new String[]{" _ ", "| |", "|_|"});
        segmentMap.put('1', new String[]{"   ", "  |", "  |"});
        segmentMap.put('2', new String[]{" _ ", " _|", "|_ "});
        segmentMap.put('3', new String[]{" _ ", " _|", " _|"});
        segmentMap.put('4', new String[]{"   ", "|_|", "  |"});
        segmentMap.put('5', new String[]{" _ ", "|_ ", " _|"});
        segmentMap.put('6', new String[]{" _ ", "|_ ", "|_|"});
        segmentMap.put('7', new String[]{" _ ", "  |", "  |"});
        segmentMap.put('8', new String[]{" _ ", "|_|", "|_|"});
        segmentMap.put('9', new String[]{" _ ", "|_|", " _|"});
        segmentMap.put('+', new String[]{"   ", " | ", " | "});
        segmentMap.put('-', new String[]{"   ", " _ ", "   "});
        segmentMap.put('*', new String[]{"   ", " * ", "   "});
        segmentMap.put('=', new String[]{"   ", " _ ", " _ "});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] grid = new String[3];
        for (int i = 0; i < 3; i++) {
            grid[i] = sc.nextLine();
        }

        // Decode the segments into characters
        List<Character> equation = new ArrayList<>();
        List<String[]> segments = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] segment = new String[3];
            for (int j = 0; j < 3; j++) {
                segment[j] = grid[j].substring(i * 3, i * 3 + 3);
            }
            segments.add(segment);
            equation.add(decodeSegment(segment));
        }

        // Find the faulty segment
        int faultyPosition = findFaultySegment(equation, segments);
        System.out.println(faultyPosition);
    }

    private static int findFaultySegment(List<Character> equation, List<String[]> segments) {
        // Evaluate the equation sequentially
        for (int i = 0; i < segments.size() - 2; i++) { // Exclude RHS and '='
            char original = equation.get(i);

            for (Map.Entry<Character, String[]> entry : segmentMap.entrySet()) {
                char newChar = entry.getKey();
                String[] newSegment = entry.getValue();

                if (newChar != original && isOneToggleAway(segments.get(i), newSegment)) {
                    // Temporarily replace the character and evaluate
                    char temp = equation.get(i);
                    equation.set(i, newChar);

                    if (isEquationValid(equation)) {
                        return i + 1; // Return 1-based index
                    }

                    // Restore the original character
                    equation.set(i, temp);
                }
            }
        }
        return -1; // Should not happen given constraints
    }

    private static boolean isEquationValid(List<Character> equation) {
        int result = Character.getNumericValue(equation.get(0));
        for (int i = 1; i < equation.size() - 2; i += 2) {
            char operator = equation.get(i);
            int operand = Character.getNumericValue(equation.get(i + 1));

            switch (operator) {
                case '+':
                    result += operand;
                    break;
                case '-':
                    result -= operand;
                    break;
                case '*':
                    result *= operand;
                    break;
                case '%':
                    result %= operand;
                    break;
                default:
                    return false;
            }
        }

        int rhs = Character.getNumericValue(equation.get(equation.size() - 1));
        return result == rhs;
    }

    private static boolean isOneToggleAway(String[] original, String[] target) {
        int diff = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (original[i].charAt(j) != target[i].charAt(j)) {
                    diff++;
                }
            }
        }
        return diff == 1; // Exactly one LED needs toggling
    }

    private static Character decodeSegment(String[] segment) {
        for (Map.Entry<Character, String[]> entry : segmentMap.entrySet()) {
            if (Arrays.equals(entry.getValue(), segment)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
