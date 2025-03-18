
public class Palindrome {

    public static void main(String[] args) {

        int i, j, num = 6;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            //left numbers
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            //Right numbers
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

}
