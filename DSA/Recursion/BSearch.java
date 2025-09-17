
public class BSearch {

    static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // Base case: not found
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, end, target); // Right half
        } else {
            return binarySearch(arr, start, mid - 1, target); // Left half

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 18, 25, 31};
        int target = 1;

        int index = binarySearch(arr, 0, arr.length - 1, target);
        System.out.println(index >= 0 ? "Found at index " + index : "Not found");

        //  System.out.println(index);
    }
}

// Time complexity: O(log n)
// Space complexity: O(log n) 
