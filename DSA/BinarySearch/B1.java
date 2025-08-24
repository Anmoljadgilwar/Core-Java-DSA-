//Binary Search only applied in Sorted Array

public class B1 {

    public static void main(String[] args) {

        int arr[] = {-10, -6, -4, -1, 0, 1, 2, 108};
        int target = 108;

        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    //return the index of the element in the array
    //return -1 if the element is not present in the array

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            // int mid = (start + end) / 2; //might be possible that (start + end) value exceeds the range of int in java
            int mid = start + (end - start) / 2;  //BODMASS

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //equal to target, ans found
                return mid;
            }
        }
        return -1;
    }
}
