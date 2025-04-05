
//why ceiling?
//find the smallest number >= target
//eg. if target = 8, return 9
public class Ceiling {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;
        System.out.println(ceiling(arr, target));

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

    }

}

//Floor?
//find the smallest number <= target
//return end;
