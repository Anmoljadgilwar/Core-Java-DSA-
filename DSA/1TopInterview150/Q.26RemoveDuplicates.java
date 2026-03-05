//Q. 26 Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Q26RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

//step by step execution:
// 1. Initialize index to 1 (the position to place the next unique element).
// 2. Start iterating from the second element (i = 1) to the end of the array.
// 3. Check if the current element is different from the previous element (nums[i] != nums[i - 1]).
// 4. If it is, place the current element at the current index (nums[index] = nums[i]) and increment the index.
// 5. Return the new length of the array (index).
// 6. The first 'index' elements of the array will now contain the unique elements.
// 7. The remaining elements in the array are not relevant and can be ignored.
// 8. The array is modified in place, so no additional space is used for a new array.
// 9. The time complexity is O(n) and the space complexity is O(1) since no extra space is used.
