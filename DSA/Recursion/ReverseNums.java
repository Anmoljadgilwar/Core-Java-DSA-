
public class ReverseNums {

    static int sum = 0;  // global variable to hold the reversed number

    static void reverse(int n) {
        if (n == 0) {     // base case: stop when no digits left
            return;
        }
        int rem = n % 10;             // extract last digit
        sum = (sum * 10) + rem;        // build reversed number
        reverse(n / 10);     // recursive call with remaining digits(removes last digit)
    }

    public static void main(String[] args) {
        reverse(12345);
        System.out.println(sum);  // prints 54321
    }
}

// Dry Run (for 12345)
// n = 12345 → rem = 5 → sum = 0*10 + 5 = 5
// n = 1234 → rem = 4 → sum = 5*10 + 4 = 54
// n = 123 → rem = 3 → sum = 54*10 + 3 = 543
// n = 12 → rem = 2 → sum = 543*10 + 2 = 5432
// n = 1 → rem = 1 → sum = 5432*10 + 1 = 54321
// n = 0 → recursion ends.
// Output: 54321

