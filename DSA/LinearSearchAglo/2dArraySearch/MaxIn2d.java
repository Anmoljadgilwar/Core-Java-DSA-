
public class MaxIn2d {

    public static void main(String[] args) {

        int[][] arr = {{11, 21, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120, 130, 140, 5}};
        System.out.println(max(arr));
        System.out.println(countEven(arr));

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

// function to ckeck even number
//     static boolean isEven(int num) {
//         return num % 2 == 0;
//     }
// }
// function to ckeck how many even numbers in array  
    static int countEven(int[][] arr) {
        int count = 0;
        for (int[] row : arr) {
            for (int col : row) {
                if (Even(col)) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean Even(int num) {
        return num % 2 == 0;
    }
}

//for (int row = 0; row < arr.length; row++) {
//       for (int col = 0; col < arr[row].length; col++) {
//           if (arr[row][col] > max) {
//               max = arr[row][col];
//           }
//       }
//   }
