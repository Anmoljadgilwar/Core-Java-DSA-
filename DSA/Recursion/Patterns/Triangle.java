
import java.util.Arrays;

class Triangle {

    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
        System.out.println();
        //
        int[] arr = {4, 1, 3, 7, 2, 5, 6};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        //Selection Sort
        selectionSortRec(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));

        //Merge Sort
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }

    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");

        } else {
            triangle2(r - 1, 0);
            System.out.println();

        }

    }

    //last element sorted first
    //so it is in bootom of call stack
    // r = end, c = start
    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);

        } else {
            bubble(arr, r - 1, 0);
        }
        //Time complexity: O(n^2)

    }

    //Selection Sort
    static void selectionSortRec(int[] arr, int end, int start, int maxIndex) {
        if (end == 0) {
            return;
        }

        if (start < end) {
            if (arr[start] > arr[maxIndex]) {
                selectionSortRec(arr, end, start + 1, start);
            } else {
                selectionSortRec(arr, end, start + 1, maxIndex);
            }
        } else {
            // swap the largest element with the last element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[end - 1];
            arr[end - 1] = temp;

            selectionSortRec(arr, end - 1, 0, 0);
        }
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //it maybe possible that one of the array is not fully traversed, so we need to copy the remaining elements from that array

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

// ****
// ***
// **
// *
//
// public class RecursiveSelectionSort {
//     // Recursive function to perform selection sort
//     static void selectionSort(int[] arr, int start) {
//         int n = arr.length;
//         // Base case: if we reach the end, return
//         if (start >= n - 1)
//             return;
//         // Find index of the minimum element in the rest of array
//         int minIndex = start;
//         for (int i = start + 1; i < n; i++) {
//             if (arr[i] < arr[minIndex]) {
//                 minIndex = i;
//             }
//         }
//         // Swap the found minimum element with the first element
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[start];
//         arr[start] = temp;
//         // Recursive call for the rest of the array
//         selectionSort(arr, start + 1);
//     }
//     // Helper function to print array
//     static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
//     // Main function
//     public static void main(String[] args) {
//         int[] arr = {5, 3, 8, 4, 2};
//         System.out.println("Before Sorting:");
//         printArray(arr);
//         selectionSort(arr, 0);  // Start from index 0
//         System.out.println("After Sorting:");
//         printArray(arr);
//     }
// }
