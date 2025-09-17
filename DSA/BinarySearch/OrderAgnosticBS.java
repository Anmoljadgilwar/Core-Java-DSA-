//time complexity is same
// O(log n)

public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {108, 40, 10, 2, 0, -1, -2, -4};
        // int[] arr = {-8, -6, -4, -1, 0, 1, 2, 3, 4, 108, 116, 118, 208};
        int target = -4;
        System.out.println(orderAgnosticBS(arr, target));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {  //base case
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
