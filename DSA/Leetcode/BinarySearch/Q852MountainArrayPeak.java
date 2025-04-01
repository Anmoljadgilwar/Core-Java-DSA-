// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Q852. Peak Index in a Mountain Array
//easy

public class Q852MountainArrayPeak {

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 5, 3, 1};
        System.out.println(peakIndexInMountainArray(arr));  // Output: 3
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in the decreasing part of the mountain
                // Move towards the peak on the left
                end = mid;
            } else {
                // We are in the increasing part of the mountain
                // Move towards the peak on the right
                start = mid + 1;
            }
        }

        // When start == end, we have found the peak
        return start;

    }
}
