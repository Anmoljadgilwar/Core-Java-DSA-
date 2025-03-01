
import java.util.Arrays;
//find element in 2d array

public class TwoDS {

    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120, 130, 140}};

        int target = 140;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
                //    System.out.print(arr[row][col] + "  ");
            }
            //  System.out.println();
        }
        return new int[]{0, 0};
    }
}
