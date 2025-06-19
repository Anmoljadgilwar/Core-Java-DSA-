import java.util.Arrays;
//
//class Selection{
//    public static void main(String[] args) {
//        int[] arr = {4, 6, 2, 8, 10};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static int selection (int[] arr){
//
//        for (int i = 0; i < arr.length; i++){
//            //find the max element in the remaining array and swap it with the first element
//            int last = arr.length - i - 1;
//            int maxIndex = getmax(arr, 0, last);
//            swap(arr, maxIndex, last);
//
//        }
//        return 0;
//    }
//
//
//    static int swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//        return arr[first];
//
//    }
//
//    static int getmax (int[] arr, int start, int end){
//        int max = arr[start];
//        for (int i = start; i < end; i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//
//
//    }
//
//}
//
//
class Selection {
    
        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the index of the minimum element in the unsorted part
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum with the element at i
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 25, 12, 22, 11};

            selectionSort(arr);

            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
