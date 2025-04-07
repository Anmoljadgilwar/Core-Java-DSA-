
public class Q410SplitArrLargestSum {

    public static void main(String[] args) {
        int nums[] = {7, 2, 5, 10, 8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max element
            end += nums[i]; // sum of all elements // end = end + nums[i];
        }

        // Binary search between start and end
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // start new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // or return start; both are equal here
    }
}
