
public class ReverseCharArray {

    public static void reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverse(input);

        // Output reversed array
        System.out.println("Reversed array: " + String.valueOf(input));
    }
}
// Output: Reversed array: olleh

//for Integer array
// public class ReverseIntegerArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         reverse(arr);
//         System.out.println("Reversed array: " + Arrays.toString(arr));
//     }
//
//     public static void reverse(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
// Output: Reversed array: [5, 4, 3, 2, 1]
// for String array
// public class ReverseStringArray {
//     public static void main(String[] args) {
//         String[] arr = {"hello", "world", "java"};
//         reverse(arr);
//         System.out.println("Reversed array: " + Arrays.toString(arr));
//     }
//
//     public static void reverse(String[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {            
// String temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
// Output: Reversed array: [java, world, hello]
