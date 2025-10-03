
public class Find {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int target = 3;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false; //base case
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1; //base case
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }
    //TODO find last index
}

//commit message for this program : "Find element in array"
