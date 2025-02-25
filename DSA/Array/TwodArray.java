
class TwodArray {

    // you cannot assign null to any primitive data type
    //int num = null; 
    // String num = null;
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //i=0 cause index starts from 0
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
//
// class TwodArray {
//     public static void main(String[] args) {
//         int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 1, 2}};
//         //i=0 cause index starts from 0
//         // for (int[] a : arr) {
//         //     System.out.println(Arrays.toString(a));
//         // }
//         for (int i = 0; i < 3; i++) {
//             System.out.println(Arrays.toString(arr[i]));
//         }
// //arr.length = number of rows
//     }
// }
//
//
//
// class TwodArray {
//     public static void main(String[] args) {
//         int arr[][] = new int[4][3];
//         arr[0][0] = 10;
//         arr[0][1] = 20;
//         arr[0][2] = 30;
//         arr[1][0] = 40;
//         arr[1][1] = 50;
//         arr[1][2] = 60;
//         arr[2][0] = 70;
//         arr[2][1] = 80;
//         arr[2][2] = 90;
//         arr[3][0] = 91;
//         arr[3][1] = 92;
//         arr[3][2] = 93;
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//      //   System.out.println(arr[2][2]);
//     }
// }

// class TwodArray {
// you cannot assign null to any primitive data type
//int num = null; 
//     String num = null;
//     public static void main(String[] args) {
//         int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         //i=0 cause index starts from 0
//         for (int j = 0; j < arr.length; j++) {
//             System.out.println(Arrays.toString(arr[j]) + " ");
//         }
//         System.out.println();
//     }
// }
