
public class Descending {

    static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 5, 1};
        insertionSortDescending(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
