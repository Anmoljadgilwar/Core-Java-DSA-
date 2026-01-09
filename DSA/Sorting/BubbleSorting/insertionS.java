
import java.util.Arrays;

public class insertionS {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 8, -6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {  //logic yaha hai i+1, j--
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }

    }

    static int swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr[first];

    }
}
//time complexity: O(n^2)
//space complexity: O(1)


/*
    🪜 Step-by-Step Execution:
Initial array: [4, 2, 1, 5, 8]
🔁 i = 0
j = 1, compare 2 and 4 → 2 < 4 → swap → [2, 4, 1, 5, 8]

🔁 i = 1
j = 2, compare 1 and 4 → 1 < 4 → swap → [2, 1, 4, 5, 8]

j = 1, compare 1 and 2 → 1 < 2 → swap → [1, 2, 4, 5, 8]

🔁 i = 2
j = 3, compare 5 and 4 → 5 > 4 → break (no swap)
→ [1, 2, 4, 5, 8]

🔁 i = 3
j = 4, compare 8 and 5 → 8 > 5 → break (no swap)
→ [1, 2, 4, 5, 8]

✅ Final Sorted Array: [1, 2, 4, 5, 8]
 */
