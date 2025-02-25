
import java.util.Arrays;
//swap all elements

public class Swap {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 5, 1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Array after swapping: " + Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapme(arr, start, end);
            start++;
            end--;
        }
    }

    static void swapme(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
//
//
// public class Swap {

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         swapme(arr, 0, 4);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void swapme(int[] arr, int index1, int index2) {
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;
//     }
// }
// public static void main(String[] args) {
//    int[] arr = {1, 2, 3, 4, 5};
//    int i = 1, j = 3;  // Indices to swap (arr[1] and arr[3])
//    // Swapping
//    int temp = arr[i];
//    arr[i] = arr[j];
//    arr[j] = temp;
//    // Print swapped array
//    for (int num : arr) {
//        System.out.print(num + " ");
//    }
// }
// }
