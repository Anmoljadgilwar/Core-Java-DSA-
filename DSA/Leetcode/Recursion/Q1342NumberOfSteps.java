//Leetcode  
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

////Description:
//Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

//Brootforce
// class Solution {
//    public int numberOfSteps (int num) {
//       int count = 0;
//       while (num > 0) {
//          if (num % 2 == 0) {
//             num = num / 2;
//          } else {
//             num = num - 1;
//          }
//          count++;
//       }
//       return count;
//    }
// }
//
// * Recursive way (optimized) *
public class Q1342NumberOfSteps {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(helper(num, 0)); // Output: 6
    }

    // helper function with step counter
    static int helper(int num, int steps) {
        // base case: when num becomes 0, return the steps taken
        if (num == 0) {
            return steps;
        }

        if (num % 2 == 0) {
            // if even → divide by 2, increase step count
            return helper(num / 2, steps + 1);
        } else {
            // if odd → subtract 1, increase step count
            return helper(num - 1, steps + 1);
        }
    }
}

//Time Complexity: O(log n)
//Space Complexity: O(log n)
//
//Public methods = intended to be used by others.
//Private methods = internal logic only, all internal helper functions.
//
/**
 *
 * 🔎 Why return helper(num, 0) instead of just helper(num, 0);? Because:

 *  *helper(num, 0) calculates a value (the number of steps).

 *  *If we just call it without return, the result would be computed but then
 * immediately thrown away.

 *  *We want numberOfSteps() to actually give that result back to LeetCode’s test
 * system.

 *  *✅ In short:

 *  *helper() :- computes the value.

 *  *return :- passes it back to whoever called numberOfSteps().
 */
