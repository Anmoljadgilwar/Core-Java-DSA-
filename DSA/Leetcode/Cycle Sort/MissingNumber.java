// https://leetcode.com/problems/missing-number/
// 268. Missing Number
//Easy
//Description:
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]) {
                // swap nums[i] and nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Find the missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        // If all are in place, then n is the missing number
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number is: " + missingNumber(nums));
    }
}
