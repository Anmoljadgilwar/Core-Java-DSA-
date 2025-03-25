//Q. 744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Q744FindCeilingLetter {

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(new Q744FindCeilingLetter().nextGreatestLetter(letters, target));

    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0, end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}

// class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//       int start = 0, end = letters.length - 1, mid = 0;
//       while (start <= end) {
//          mid = start + (end - start) / 2;
//          if (letters[mid] > target) {
//             end = mid - 1;
//          } else {
//             start = mid + 1;
//          }
//       }
//       return letters[start % letters.length];
//    }
// }
