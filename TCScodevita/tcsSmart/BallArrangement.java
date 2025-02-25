
import java.util.HashMap;
import java.util.Map;

public class BallArrangement {

    // Memoization map to store previously computed results
    static Map<String, Integer> memo = new HashMap<>();

    /**
     * Recursively counts the number of valid ways to arrange the balls such
     * that no two adjacent balls are of the same type.
     *
     * @param g Number of green balls remaining
     * @param y Number of yellow balls remaining
     * @param r Number of red balls remaining
     * @param lastPlaced The last ball color placed ('G', 'Y', 'R', or 'N' for
     * none)
     * @return The count of valid arrangements
     */
    public static int countArrangements(int g, int y, int r, char lastPlaced) {
        // Create a unique key to store the state in the memoization map
        String key = g + "," + y + "," + r + "," + lastPlaced;
        if (memo.containsKey(key)) {
            return memo.get(key); // Return previously computed result
        }

        // Base case: If all balls are placed, count this as one valid arrangement
        if (g == 0 && y == 0 && r == 0) {
            return 1;
        }

        int total = 0;

        // Try placing a green ball if available and the last placed ball wasn't green
        if (g > 0 && lastPlaced != 'G') {
            total += countArrangements(g - 1, y, r, 'G');
        }

        // Try placing a yellow ball if available and the last placed ball wasn't yellow
        if (y > 0 && lastPlaced != 'Y') {
            total += countArrangements(g, y - 1, r, 'Y');
        }

        // Try placing a red ball if available and the last placed ball wasn't red
        if (r > 0 && lastPlaced != 'R') {
            total += countArrangements(g, y, r - 1, 'R');
        }

        // Store the computed result in the memoization map
        memo.put(key, total);
        return total;
    }

    /**
     * Initializes the recursive function and clears the memoization map.
     *
     * @param g Number of green balls
     * @param y Number of yellow balls
     * @param r Number of red balls
     * @return The count of valid arrangements
     */
    public static int findArrangementCount(int g, int y, int r) {
        memo.clear(); // Reset memoization for a new calculation
        return countArrangements(g, y, r, 'N'); // 'N' represents no last placed ball initially
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(findArrangementCount(1, 1, 1)); // Output: 6
        System.out.println(findArrangementCount(1, 1, 0)); // Output: 2
    }
}
