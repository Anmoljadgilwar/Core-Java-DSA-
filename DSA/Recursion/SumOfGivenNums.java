
public class SumOfGivenNums {

    public static void main(String[] args) {

        System.out.println(sum(12345));
    }

    static int sum(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return (n % 10) + sum(n / 10);  // Recursive call 
    }

}
