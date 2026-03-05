
import java.util.Scanner;
import java.util.Stack;

public class Sol1 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty and closing bracket appears
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if matching pair
                if ((ch == ')' && top != '(')
                        || (ch == '}' && top != '{')
                        || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String input = sc.nextLine();

        boolean result = isValid(input);

        System.out.println("Is valid? " + result);

        sc.close();
    }
}
