
import java.util.Arrays;

public class First2DBS {

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {26, 28, 38, 48},
            {33, 34, 39, 50}
        };
        int target = 20;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r, c}; //target found
            }
            if (matrix[r][c] < target) {
                r++; // go down
            } else {
                c--; // go left
            }
        }
        return new int[]{-1, -1};  //target doesn't exist

    }
}

/*
This Java program demonstrates a search algorithm in a 2D matrix (also called staircase search) where the matrix is sorted row-wise and column-wise in ascending order.

🔍 Problem
Given a sorted 2D matrix like:


int[][] arr = {
    {10, 20, 30, 40},
    {15, 25, 35, 45},
    {26, 28, 38, 48},
    {33, 34, 39, 50}
};
Find the coordinates of a target element (e.g., 20).

🔁 Logic (Staircase Search)
Start from top-right corner: matrix[0][last column]

Compare the current element with the target:

If equal ➝ return position

If current element < target ➝ move down

If current element > target ➝ move left

This works because:

Moving down → values increase (row-wise sorted)

Moving left → values decrease (column-wise sorted)
 */
