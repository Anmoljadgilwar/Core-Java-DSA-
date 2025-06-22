
public class BSearch {

    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1; // Base case: not found
        }
        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid; 
        }else if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, high, key); // Right half
         }else {
            return binarySearch(arr, low, mid - 1, key); // Left half

            }}

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 18, 25, 31};
        int key = 18;

        int index = binarySearch(arr, 0, arr.length - 1, key);
        System.out.println(index >= 0 ? "Found at index " + index : "Not found");
    }
}
