
import java.util.Arrays;

public class kunalIS {

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 5, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
