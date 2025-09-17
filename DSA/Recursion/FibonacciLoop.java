//iterative way (Easy one)

public class FibonacciLoop {

    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int prev2 = 0; // fib(0)
        int prev1 = 1; // fib(1)
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // fib(i) = fib(i-1) + fib(i-2)
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // prints 8
    }
}
