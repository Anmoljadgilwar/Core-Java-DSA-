
// //why ceiling?
// //find the smallest number >= target
// //eg. if target = 8, return 9
// public class Ceiling {
//     public static void main(String[] args) {
//         //Ceiling value (Less greater than targed )
//         int[] arr = {2, 3, 5, 9, 14, 16, 18};
//         int target = 8;
//         System.out.println(ceiling(arr, target));
//         //printing floor value
//         Floor fl = new Floor();
//         int ans = fl.floor(arr, target);
//         System.out.println(ans);
//     }
//     //return the index of smalled element >= target
//     static int ceiling(int[] arr, int target) {
// //
//         if (target > arr[arr.length - 1]) { //if target is greater than the largest element in the array, return -1
//             return -1;
//         }
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             //find the middle element
//             int mid = start + (end - start) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             //decide which side to search
//             if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         //here, the answer which is greater than target 
//         return start;
//         //for floor, return end
//     }
// }
// //Floor?
// //find the smallest number <= target
// //return end;
// class Floor {
//     int floor(int[] arr, int target) {
//         if (target < arr[0]) { //if target is less than the smallest element in the array, return -1
//             return -1;
//         }
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             //find the middle element
//             int mid = start + (end - start) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             }
//             //decide which side to search
//             if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         //here, the answer which is greater than target 
//         return end;
//     }
// }
//
//why ceiling?
//find the smallest number >= target
//eg. if target = 8, return 9
public class Ceiling {

    public static void main(String[] args) {

        // int[] arr = {2, 3, 5, 8, 9, 14, 16, 18};
        int[] arr = {2, 3, 5, 6, 9, 14, 16, 18};
        int target = 8;

        //Ceiling value (Less greater than targed )
        System.out.println(ceiling(arr, target));
        //printing floor value
        System.out.println(floor(arr, target));

    }

    //return the index of smalled element >= target
    static int ceiling(int[] arr, int target) {
//
        if (target > arr[arr.length - 1]) { //if target is greater than the largest element in the array, return -1
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            //decide which side to search
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //here, the answer which is greater than target 
        return start;
        //for floor, return end

    }
//
//Floor?
//find the smallest number <= target
//return end;

    //floor function
    static int floor(int[] arr, int target) {

        if (target < arr[0]) { //if target is less than the smallest element in the array, return -1
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            //decide which side to search
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //here, the answer which is greater than target 
        return end;

    }

}
