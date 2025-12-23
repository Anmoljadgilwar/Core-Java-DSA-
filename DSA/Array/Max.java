
// public class Max {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         System.out.println(maxval(arr));
//     }
//     static int maxval(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }
public class Max {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        maxval(arr, 1);  // Call the method to print max value
    }

    static void maxval(int[] arr, int n) {

        int maxx = arr[0];
        for (int i = n; i < arr.length; i++) {
            maxx = Math.max(maxx, arr[i]);

        }

        System.out.println("Maximum value: " + maxx);
    }
}
//time complexity: O(n)
//space complexity: O(1)
