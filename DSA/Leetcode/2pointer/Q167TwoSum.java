// Leetcode: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length. 
public class Q167TwoSum {

    public static void main(String[] args) {
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        Q167TwoSum solution = new Q167TwoSum();
        int[] result = solution.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indexing
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Should not be reached (guaranteed one solution)
    }

}

//time complexity: 
//output: [1, 2]
//Execution step by step:
// 1. Initialize left pointer at index 0 and right pointer at the last index of the array.   
// 2. Calculate the sum of the elements at the left and right pointers.
// 3. If the sum equals the target, return the indices of the two numbers (1-based).
// 4. If the sum is less than the target, move the left pointer to the right.
// 5. If the sum is greater than the target, move the right pointer to the left. 
// 6. Repeat steps 2-5 until the left pointer is no longer less than the right pointer.
// 7. If no solution is found, return [-1, -1].
