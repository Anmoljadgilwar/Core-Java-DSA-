// Q. 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Q34FLPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the first occurrence
        int first = search(nums, target, true);
        if (first == -1) {
            return result; // Target not found
        }

        // Find the last occurrence
        int last = search(nums, target, false);
        result[0] = first;
        result[1] = last;
        return result;
    }

    // Binary search to find first or last occurrence
    public static int search(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                index = mid; // Found target
                if (findFirst) {
                    end = mid - 1; // Move left
                } else {
                    start = mid + 1; // Move right
                }
            }
        }
        return index;
    }
}
