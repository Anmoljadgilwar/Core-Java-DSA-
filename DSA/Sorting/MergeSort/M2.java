
public class M2 {

    static int[] divide(int[] arr, int start, int end) {

        // Base case
        if (start == end) {
            return new int[]{arr[start]};
        }

        int mid = start + (end - start) / 2;

        // Divide
        int[] left = divide(arr, start, mid);
        int[] right = divide(arr, mid + 1, end);

        // Conquer (merge)
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        // Remaining elements
        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 1, 8, 9, 10};

        int[] sorted = divide(arr, 0, arr.length - 1);

        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}

// | Aspect           | Value        |
// | ---------------- | -------------|
// | Time Complexity  |   O(n log n) |
// | Space Complexity |   O(n)       |
