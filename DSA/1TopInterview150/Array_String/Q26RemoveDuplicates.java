//26. Remove Duplicates from Sorted Array 
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Q26RemoveDuplicates {

    static int removeDuplicates(int[] nums) {

        int i = 0; // Pointer for the last unique element
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // Move the pointer for unique elements
                nums[i] = nums[j]; // Update the next unique element
            }
        }
        return i + 1; // Length of the array with unique elements   
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 4, 5, 5};
        int uniquepart = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniquepart; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// if (nums.length == 0) {  removed because of speed optimization, not needed as per constraints
//          return 0;
   //      }
