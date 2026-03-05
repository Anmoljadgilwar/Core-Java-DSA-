
class Solution {

    public static int[] mergeSorted(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        return result;
    }

}

// Time Complexity
// O(n + m)
// Can you do it without extra space?
// Yes, if nums1 has enough empty space at the end (LeetCode style)
// Real-World Usage.
// Merge Sort algorithm
// Database sorted query merge
