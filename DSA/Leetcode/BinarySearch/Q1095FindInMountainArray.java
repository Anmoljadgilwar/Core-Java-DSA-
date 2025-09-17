
//Q1095. Find in Mountain Array
//https://leetcode.com/problems/find-in-mountain-array/
//Medium
public class Q1095FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 5, 3, 1};
        System.out.println(search(arr, 1));

    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        //first half search
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
        //second half search
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            //decide which side to search
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
