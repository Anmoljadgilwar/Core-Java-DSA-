
public class SearchInRange {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 25, 40, 6, 108, 8, 6666, 10};
        int target = 10;
        System.out.println(linearSearch(arr, 0, 4, target));
    }

    static int linearSearch(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            return 0;
        }
        for (int index = start; index <= end; index++) {

            if (arr[index] == target) {
                return index;
            }
        }
        return 0;
    }

}
