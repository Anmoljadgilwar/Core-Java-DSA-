// Bubble Sort in Java
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Stable Sort: Yes
// In-place Sort: Yes
// Best Case: O(n) when the array is already sorted
// Worst Case: O(n^2) when the array is sorted in reverse order
// Average Case: O(n^2) when the array is unsorted
// Algorithm: Compare adjacent elements and swap them if they are in the wrong order. Repeat this process until the array is sorted.
// Example: arr[] = {5, 1, 4, 2, 8} => arr[] = {1, 2, 4, 5, 8}
// Optimized Bubble Sort: If no swaps are made in a pass, the array is already sorted and we can break out of the loop early.

import java.util.Arrays;

public class B1 {

    public static void main(String[] args) {

        int arr[] = {4, 2, 6, 8, 10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap if the item is smaller than the next item
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}


/*
   public static void main(String[] args) {
      int arr[] = {5, 4, 3, 2, 1};
      bubbleSort(arr);
      printArray(arr);
   }

   public static void bubbleSort(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               // swap arr[j] and arr[j+1]
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }
   }

   public static void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }*/
