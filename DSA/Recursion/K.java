
public class K {

    // public static void main(String[] args) {
    //     K ob = new K();
    //     System.out.println(ob.factorial(4));
    // }
    public static void main(String[] args) {

        System.out.println(factorial(4));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call 
    }

}
