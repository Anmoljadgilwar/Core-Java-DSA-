
import java.util.Scanner;

class prime {

    public static void main(String[] args) {

        int n, count = 0;
        System.out.print("Enter the number: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        for (int j = 0; j < n; j++) {

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;

                }

            }
            if (count == 2) {
                System.out.println("Its a Prime number");
            } //else {
            //     System.out.println("Not Prime number");
            // }
        }
    }
}
