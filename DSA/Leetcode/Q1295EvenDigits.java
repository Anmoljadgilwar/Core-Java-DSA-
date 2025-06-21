// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Q1295. Find Numbers with Even Number of Digits

// public class Q1295EvenDigits {
//     public static void main(String[] args) {
//         int[] nums = {12, 345, 2, 6, 7896};
//         System.out.println(findNumbers(nums));
//     }
//     static int findNumbers(int[] nums) {
//         int count = 0;
//         for (int num : nums) {
//             if (even(num)) {
//                 count++;
//             }
//         }
//         return count;
//     }
//     // count number of digits in a number
//     static int digitCount(int num) {
//         if (num == 0) {
//             return 1;
//         }
//         // if (num < 0) {
//         //     num = num * -1;
//         // }
//         // int count = 0;
//         // while (num > 0) {
//         //     count++;
//         //     num = num / 10;
//         num = Math.abs(num); // Convert negative numbers to positive
//         int count = 0; // Initialize digit counter
//         while (num != 0) { // Loop until number becomes 0
//             count++; // Increment digit count
//             num /= 10; // Remove the last digit
//         }
//         return count;
//     }
//     // function to ckeck how many even numbers
//     static boolean even(int num) {
//         return digitCount(num) % 2 == 0;
//         // int numberofDigits = digitCount(num);
//         // if (numberofDigits % 2 == 0) {
//         //     return true;
//         // } else {
//         //     return false;
//         // }
//     }
// }
//String.valueOf(num).length() % 2 == 0
// `Step-by-Step Execution:`
// findNumbers(nums) is called.
// Iterates through {12, 345, 2, 6, 7896}:
// digitCount(12) = 2 → Even ✅ → count = 1
// digitCount(345) = 3 → Odd ❌
// digitCount(2) = 1 → Odd ❌
// digitCount(6) = 1 → Odd ❌
// digitCount(7896) = 4 → Even ✅ → count = 2
// Returns 2 and prints the result.
// Output:
// Copy
// Edit
// 2
public class Q1295EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }

    // count number of digits in a number
    static int digitCount(int num) {

        if (num == 0) {
            return 1;
        }

        num = Math.abs(num); // Convert negative numbers to positive
        int count = 0; // Initialize digit counter
        while (num != 0) { // Loop until number becomes 0
            count++; // Increment digit count
            num /= 10; // Remove the last digit
        }
        return count;
    }

    // function to ckeck how many even numbers
    static boolean even(int num) {

        return digitCount(num) % 2 == 0;
    }
}
