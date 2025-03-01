
public class MaxIn2d {

    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120, 130, 140}};
        System.out.println(max(arr));

    }

    static int max(int[][] arr) {
//int max = Integer.MIN_VALUE;
        int max = arr[0][0];

        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }

        return max;
    }
}

//for (int row = 0; row < arr.length; row++) {
//       for (int col = 0; col < arr[row].length; col++) {
//           if (arr[row][col] > max) {
//               max = arr[row][col];
//           }
//       }

   //   }
