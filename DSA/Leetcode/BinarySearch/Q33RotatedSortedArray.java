// https://leetcode.com/problems/search-in-rotated-sorted-array/
// Q33. Search in Rotated Sorted Array
// Medium

public class Q33RotatedSortedArray {

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            //decide which side to search
            //if left side is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //if right side is sorted
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

//
