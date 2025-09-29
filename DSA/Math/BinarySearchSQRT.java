//https://www.geeksforgeeks.org/square-root-of-a-number-using-binary-search/

class BinarySearchSQRT {

    public static void main(String[] args) {
        int n = 27;
        int p = 3;
        System.out.println(sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            }
            if (mid * mid < n) {
                s = mid + 1;
                root = mid;
            } else {
                e = mid - 1;
            }
        }
        return root;
    }
}
