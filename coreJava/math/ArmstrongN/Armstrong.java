
import java.util.Scanner;

class Armstrong {

    public static void main(String[] args) {
        // int n, sum = 0, rem, temp;
        int n;
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;  //find the remainder (153%10 = 3) last digit 3
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        return sum == original;
    }
}

// class Armstrong {
//     public static void main(String[] args) {
//         // int n, sum = 0, rem, temp;
//         int n;
// // Print all 3 digits Armstrong numbers 
//         for (int i = 100; i < 1000; i++) {
//             if (isArmstrong(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     public static boolean isArmstrong(int n) {
//         int original = n;
//         int sum = 0;
//         while (n > 0) {
//             int rem = n % 10;
//             n = n / 10;
//             sum = sum + (rem * rem * rem);
//         }
//         return sum == original;
//     }
// }
