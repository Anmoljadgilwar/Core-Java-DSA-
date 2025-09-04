// Q. 231 Power of Two
// https://leetcode.com/problems/power-of-two/description/

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
}
