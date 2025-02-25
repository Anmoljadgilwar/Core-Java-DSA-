
import java.util.*;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int Numbers[] = new int[size];

        for (int i = 0; i < size; i++) {

            Numbers[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] < min) {
                min = Numbers[i];

            }
            if (Numbers[i] > max) {
                max = Numbers[i];
            }
        }
        System.out.println("Largest Number: " + max);
        System.out.println("Smallest Number: " + min);

    }
}
