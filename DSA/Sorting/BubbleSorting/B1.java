// Bubble Sort in Java
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Stable Sort: Yes
// In-place Sort: Yes

// Algorithm: Compare adjacent elements and swap them if they are in the wrong order. Repeat this process until the array is sorted.
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
            // for each step, max item will come at the last respective index, so we don't need to compare it again.(-i)
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

//IMP
/*
🟢 Inner Loop Condition
for (int j = 0; j < arr.length - 1 - i; j++)

arr.length - 1 → is the last index (because arrays are 0-based).

We subtract i → because after each outer pass, the last i elements are already in their correct sorted place (largest ones “bubbled” to the end).


 */
//last element is  already sorted, so we don't need to compare it again.
//
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
