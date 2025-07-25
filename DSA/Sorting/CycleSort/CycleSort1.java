
import java.util.Arrays;

public class CycleSort1 {

    static void sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correctPos = arr[i] - 1;

            if (arr[i] != arr[correctPos]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[correctPos];
                arr[correctPos] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 1, 4};       // this will not work-> {3, 5, 8, 2, 4}
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

//time complexity O(n)
//space complexity O(1)
//
//If 0 in in array
// import java.util.Arrays;
// public class CycleSort1 {
//     static void sort(int arr[]) {
//         int i = 0;
//         while (i < arr.length) {
//             int correctPos = arr[i];
//             if (arr[i] != arr[correctPos]) {
//                 //swap
//                 int temp = arr[i];
//                 arr[i] = arr[correctPos];
//                 arr[correctPos] = temp;
//             } else {
//                 i++;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 5, 2, 1, 0, 4};       // this will not work-> {3, 5, 8, 2, 4}
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }
