
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sample, range;

        System.out.print("Enter the number of Samples ");
        sample = obj.nextInt();

        System.out.print("Enter the number of Range ");
        range = obj.nextInt();

        System.out.println("Enter the numbers");
        int[] arr = new int[sample];

        for (int i = 0; i < sample; i++) {
            arr[i] = obj.nextInt();
        }

        for (int i = 0; i < range; i++) {
            System.out.println("Enter the min and max range");
            int left = obj.nextInt();
            int right = obj.nextInt();
            int count = 0;
            for (int j = 0; j < sample; j++) {
                if (arr[j] >= left && arr[j] <= right) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
