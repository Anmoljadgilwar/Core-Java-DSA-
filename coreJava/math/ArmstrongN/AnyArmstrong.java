
import java.util.Scanner;

public class AnyArmstrong {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = obj.nextInt();
        obj.close(); // Close Scanner

        System.out.println(isArmstrong(n));

        //   for (int i = 1000; i < 10000; i++) {
        //       if (isArmstrong(i)) {
        //           System.out.print(i + " ");
        //       }
        //   }
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = Integer.toString(n).length(); // Count digits

        while (n > 0) {
            int rem = n % 10; // Extract last digit
            sum += Math.pow(rem, digits); // Raise to power and add to sum
            n = n / 10;  // Remove last digit
        }

        return sum == original; // Compare sum with original number
    }
}
