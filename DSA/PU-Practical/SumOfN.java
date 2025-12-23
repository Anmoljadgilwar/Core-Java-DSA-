import java.util.Scanner;

public class SumOfN {

    /**
     * @brief Recursively calculates the sum of the first N natural numbers. The
     * recursive relation is: sum(n) = n + sum(n-1)
     *
     * @param n The upper limit (number of natural numbers).
     * @return The sum of numbers from 1 up to n.
     */
    public static int sum(int n) {
        // Base Case: The recursion must stop here.
        // The sum of the first 1 natural number is 1.
        if (n == 1) {
            return 1;
        }

        // Recursive Step: The problem is reduced to a smaller, identical subproblem.
        // It returns the current number 'n' plus the sum of all numbers before it.
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        // Input Loop
        do {
            System.out.println("--- Sum of First N Natural Numbers (Java) ---");
            System.out.print("Enter a positive integer N: ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Please enter a positive integer (N > 0).");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
                num = 0;
            }

        } while (num <= 0);

        // Call the recursive function
        int result = sum(num);

        System.out.println("\n--- Result ---");
        System.out.println("The sum of the first " + num + " natural numbers is: " + result);

        scanner.close();
    }
}
