
public class CountZeros {

    public static void main(String[] args) {
        int n = 100000;
        // Call the recursive helper function with number 'n' 
        // and initial count of zeros as 0
        System.out.println(helper(n, 0));
    }

    // Recursive function to count the number of zeros in a number
    private static int helper(int n, int c) {
        // Base case: when the number becomes 0, 
        // return the total count of zeros found so far
        if (n == 0) {
            return c;
        }

        // Find the last digit (remainder when divided by 10)
        int rem = n % 10;

        // If the last digit is 0, increase the count (c + 1) 
        // and continue recursion with the remaining digits (n / 10)
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }

        // If the last digit is not 0, keep count the same (c) 
        // and continue recursion with the remaining digits
        return helper(n / 10, c);
    }
}
