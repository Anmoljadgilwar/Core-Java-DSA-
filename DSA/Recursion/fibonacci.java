
public class fibonacci {

    static int fib(int n) {
        if (n == 0) {
            return 0;       // Base case

        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        System.out.println(fib(10)); // Output: 8
    }
}

//explain:
// fib(6) = fib(5) + fib(4)
// fib(5) = fib(4) + fib(3)
// fib(4) = fib(3) + fib(2)
// fib(3) = fib(2) + fib(1)
// fib(2) = fib(1) + fib(0)
// fib(1) = 1
