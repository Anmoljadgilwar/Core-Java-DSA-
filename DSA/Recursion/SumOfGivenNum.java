
public class SumOfGivenNum {

    public static void main(String[] args) {

        System.out.println(sum(12345));
        System.out.println(product(555));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return (n % 10) + sum(n / 10);  // Recursive call 
    }

    //
    //
    static int product(int p) {
        if (p % 10 == 0) {
            return 1;
        }
        return (p % 10) * product(p / 10);
    }
}
