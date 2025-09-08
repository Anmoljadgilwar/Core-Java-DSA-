// Q. 231 Power of Two
// https://leetcode.com/problems/power-of-two/description/

//This program uses recursion to repeatedly divide the number by 2 until it either reaches 1 (a power of two) or fails (not a power of two).
public class Q231PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }

    public static void main(String[] args) {
        Q231PowerOfTwo obj = new Q231PowerOfTwo();
        System.out.println(obj.isPowerOfTwo(16));

    }
}

// execution logic Explaination:
// 1. n = 16
// 2. n % 2 == 0
// 3. n / 2 = 8
// 4. n = 8
// 5. n % 2 == 0
// 6. n / 2 = 4
// 7. n = 4
// 8. n % 2 == 0
// 9. n / 2 = 2
// 10. n = 2
// 11. n % 2 == 0
// 12. n / 2 = 1
// 13. n = 1
//space complexity O(1)
//time complexity O(log n)

