//Find position of an element in sorted array of infinite numbers 

public class InfiniteArray {

    public static void main(String[] args) {
        //int arr[] = {3, 5, 7, 9, 10, 90, 100};
        long[] arr = new long[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int target = 2;

        System.out.println(ans(arr, target));

    }

//1. first determine the target range start and end
    static int ans(long[] arr, int target) {
        //first find the range
        //start with a box of size 2  
        int start = 0;
        int end = 1;

        //condition for the target to be in range
        while (target > arr[end]) {
            int newStart = end + 1; //this is newStart
            //double the box value
            //end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);

    }
//2. apply binary search

    static int binarySearch(long[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }

}
