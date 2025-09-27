
public class firstR {

    public static void main(String[] args) {
        RLoop(6);
    }

    static void RLoop(int n) {
        if (n == 0) {
            return;
        }

        // System.out.println(n);  // output: 6 5 4 3 2 1
        RLoop(n - 1);
        System.out.println(n); // output: 1 2 3 4 5 6
    }
}

//Find sum of f + (n-1)
/*
    public static void main(String[] args) {

        System.out.println(sum(5));
    }

    static int sum(int n) {
        if (n == 0) {
            return 1;  // Base case
        }
        return n + sum(n - 1);  // Recursive call 
    }
 */
