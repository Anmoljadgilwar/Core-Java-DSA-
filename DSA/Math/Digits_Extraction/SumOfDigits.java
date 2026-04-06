// ## 1️⃣ Sum of digits

// 👉 Input: `n = 1234`
// 👉 Output: `10`
public class SumOfDigits {

    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while (n > 0) {
            int LDigit = n % 10;
            sum = sum + LDigit;
            n = n / 10; // n value redused by one digit (1234 - 123)
        }
        System.out.println(sum);

    }
}
