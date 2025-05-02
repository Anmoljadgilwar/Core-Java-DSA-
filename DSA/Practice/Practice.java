
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        change(arr);
        //print the array
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 1008;
    }
}

//lets print prime numbers in range of 1 to 100
// class Practice {
//     public static void main(String[] args) {
//         for (int i = 2; i <= 100; i++) {
//             boolean isPrime = true;
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
