//description: Given an array of integers nums, return true if the array is sorted in non-decreasing order, and false otherwise.

public class Sorted {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5,};
        System.out.println(sorted(arr, 0));
    }

    public static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true; //base case
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1); // <=
    }
}

//time complexity: O(n)
//space complexity: O(n)
