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

        int[] arr = {4, 6, 2, 8, 10};
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

// Time Complexity: O(n^2) in the worst case, O(n) in the best case (when the array is already sorted)
// Space Complexity: O(1) as we are using only a constant amount of space for the swap variable
// Stable Sort: Yes, as we are not changing the relative order of equal elements
// In-place Sort: Yes, as we are sorting the array in place without using any extra space
/*
 Initial Array: {4, 2, 6, 8, 10}

Pass 1:
Compare 4 > 2 → swap → {2, 4, 6, 8, 10}

Compare 4 > 6 → no swap

Compare 6 > 8 → no swap

Compare 8 > 10 → no swap

Array after pass 1: {2, 4, 6, 8, 10}

Pass 2:
Compare 2 > 4 → no swap

Compare 4 > 6 → no swap

Compare 6 > 8 → no swap

swapped remains false, so loop breaks early (array is already sorted)

✅ Final Output:

[2, 4, 6, 8, 10]
 */
