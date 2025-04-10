
import java.util.Arrays;

public class Sorted2d {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] BinarySearch(int[][] matrix, int row, int target, int cStart, int cEnd) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }

            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return BinarySearch(matrix, 0, target, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Reduce the rows down to 2
        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have 2 rows: rStart and rStart + 1
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 4 parts
        if (target <= matrix[rStart][cMid - 1]) {
            return BinarySearch(matrix, rStart, target, 0, cMid - 1);
        }

        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return BinarySearch(matrix, rStart, target, cMid + 1, cols - 1);
        }

        if (target <= matrix[rStart + 1][cMid - 1]) {
            return BinarySearch(matrix, rStart + 1, target, 0, cMid - 1);
        }

        if (target >= matrix[rStart + 1][cMid + 1]) {
            return BinarySearch(matrix, rStart + 1, target, cMid + 1, cols - 1);
        }

        return new int[]{-1, -1}; // if not found
    }
}
