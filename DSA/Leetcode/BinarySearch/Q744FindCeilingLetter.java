//Q. 744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Q744FindCeilingLetter {

    public static void main(String[] args) {

        char[] letters = {'b', 'd', 'g'};
        char target = 'd';
        System.out.println(nextGreatestLetter(letters, target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {

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

        //  return letters[start]; // can give indexoutofboud error
    }
}
