
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10; // print first 10 Fibonacci numbers
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b); // only prints 0 and 1

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c); //prints remaining Series  1 2 3 5 8 13 21 34
            a = b;
            b = c;
        }
    }
}
