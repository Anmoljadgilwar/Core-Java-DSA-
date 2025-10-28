
import java.util.ArrayList;

// Linear Search using Recursion
public class Find {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int target = 3;

        System.out.println(find(arr, target, 0));          // true
        System.out.println(findIndex(arr, target, 0));     // 2
        System.out.println(findLastIndex(arr, target, arr.length - 1)); // 4

        System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
    }

    // 1️⃣ Just check if element exists
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {   // reached end of array
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    // 2️⃣ Find first index of target
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {   // base case
            return -1;
        }
        if (arr[index] == target) {
            return index;            // found it
        }
        return findIndex(arr, target, index + 1);
    }

    // 3️⃣ Find last index of target
    static int findLastIndex(int[] arr, int target, int index) {
        if (index < 0) {             // base case: start < 0
            return -1;
        }
        if (arr[index] == target) {
            return index;            // found from the end
        }
        return findLastIndex(arr, target, index - 1);
    }

//Return ArrayList
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {   // base case
            return list;
        }
        if (arr[index] == target) {
            list.add(index);            // found it
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    //Dont use it
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {   // base case
            return list;
        }
        if (arr[index] == target) {
            list.add(index);            // found it
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
