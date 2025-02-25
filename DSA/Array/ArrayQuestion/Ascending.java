
import java.util.*;

public class Ascending {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = 5;

        int Numbers[] = new int[size];
        //input Array elements
        for (int i = 0; i < size; i++) {
            Numbers[i] = obj.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < Numbers.length - 1; i++) {
            if (Numbers[i] > Numbers[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is sorted in not ascending order");

        }
    }

}
