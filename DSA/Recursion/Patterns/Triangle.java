
import java.util.Arrays;

class Triangle {

    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
        System.out.println();
        //
        int[] arr = {4, 1, 3, 2, 5, 6};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

        //Selection Sort
        selectionSortRec(arr, arr.length - 1, 0, 0);
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
    static void selectionSortRec(int[] arr, int r, int c, int maxIndex) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[maxIndex]) {
                selectionSortRec(arr, r, c + 1, c);
            } else {
                selectionSortRec(arr, r, c + 1, maxIndex);
            }
        } else {
            // swap the largest element with the last element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[r - 1];
            arr[r - 1] = temp;

            selectionSortRec(arr, r - 1, 0, 0);
        }
    }

}

// ****
// ***
// **
// *

