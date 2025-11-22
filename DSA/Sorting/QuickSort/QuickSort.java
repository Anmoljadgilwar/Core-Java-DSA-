
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        sort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
        //   Arrays.sort(arr); //java inbuilt sort method
        //   System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
//here we have to sort the array to get the correct pivot 
        while (end >= start) {
            while (pivot > nums[start]) {
                start++;
            }
            while (pivot < nums[end]) {
                end--;
            }

            if (end >= start) {

                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;

            }
        }

        //now my pivote is at the correct index, please sort two halves now 
        sort(nums, low, end);     //0 to pivote
        sort(nums, start, high); //pivote to arr.length-1

    }

}
//Avarage time complexity is O(nlogn)
//worst time complexity is O(n^2)
