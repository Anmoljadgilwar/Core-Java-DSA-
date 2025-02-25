
import java.util.Arrays;

public class SwapArrayEl {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Example array
        int mid = arr.length / 2;

        int[] part1 = Arrays.copyOfRange(arr, 0, mid);
        int[] part2 = Arrays.copyOfRange(arr, mid, arr.length);

        int factSum1 = factorialSum(part1);
        int factSum2 = factorialSum(part2);

        System.out.println("Before Swap:");
        System.out.println("Part 1: " + Arrays.toString(part1) + " -> Factorial Sum: " + factSum1);
        System.out.println("Part 2: " + Arrays.toString(part2) + " -> Factorial Sum: " + factSum2);

        // Swap the elements inside arr if needed
        if (factSum1 > factSum2) {
            swapArrayParts(arr, mid);
            System.out.println("Swapped due to higher factorial sum in Part 1.");
        }

        // Recreate parts after swapping
        part1 = Arrays.copyOfRange(arr, 0, mid);
        part2 = Arrays.copyOfRange(arr, mid, arr.length);

        System.out.println("After Swap (if needed):");
        System.out.println("Part 1: " + Arrays.toString(part1));
        System.out.println("Part 2: " + Arrays.toString(part2));
    }

    // Function to swap the two halves of an array
    private static void swapArrayParts(int[] arr, int mid) {
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[mid + i];
            arr[mid + i] = temp;
        }
    }

    // Function to calculate the sum of factorials of elements in an array
    private static int factorialSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += factorial(num);
        }
        return sum;
    }

    // Function to calculate the factorial of a number
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
