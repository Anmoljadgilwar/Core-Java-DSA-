
public class InsertionS {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Shift elements greater than current to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;   //move left and check the next element.
            }

            arr[j + 1] = current;  //Because after the last j--, we moved one step too far left. So j+1.
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 5, 4, 3};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

//time complexity: O(n^2)
//space complexity: O(1)
