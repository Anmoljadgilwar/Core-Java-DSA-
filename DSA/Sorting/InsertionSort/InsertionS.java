
public class InsertionS {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            // Shift elements greater than current to the right
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;   //move left and check the next element.
            }
            arr[j + 1] = current;  //Because after the last j--, we moved one step too far left. So j+1.
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 5, 4, 3};
        insertionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
//time complexity: O(n^2)
//space complexity: O(1)
//Sorting steps:
//{8, 5, 1, 5, 4, 3}
//{5, 8, 1, 5, 4, 3}
//{1, 5, 8, 5, 4, 3}
//{1, 3, 5, 5, 4, 8}
//{1, 3, 4, 5, 5, 8}
// public class InsertionS {

//     static void iSort(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j <= arr.length - 1; j++) {
//                 if (arr[i] > arr[j]) {
//                     int temp = arr[j];
//                     arr[j] = arr[i];
//                     arr[i] = temp;
//                 } else {
//                     continue;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {4, 8, 1, 2, 3, 6, 8};
//         // System.out.println(arr.length); // 4
//         iSort(arr);
//     }
// }
