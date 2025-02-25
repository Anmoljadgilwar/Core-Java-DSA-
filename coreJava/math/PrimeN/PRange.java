
import java.util.Scanner;

public class PRange {

    public static void main(String[] args) {
        int n, i, j;
        System.out.print("Enter the number: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(j + "  ");
            }
        }
    }
}

// public class PRange {
//     String isPrime(int n) {
//         for (int i = 2; i * i < n; i++) {
//             if (n % i == 0) {
//                 return "Not Prime";
//             }
//         }
//         return "Prime";
//     }
//     public static void main(String[] args) {
//         int n = 9;
//         System.out.println(new PRange().isPrime(n));
//     }
// }
