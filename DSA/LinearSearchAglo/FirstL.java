
public class FirstL {

    public static void main(String[] args) {

        int num[] = {10, 2, 3, 4, 6, 8, 4, -5, 40};

        int target = 4;
        int ans = linearSearch(num, target);

        System.out.println("Target value is at index: " + ans);

    }

    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
