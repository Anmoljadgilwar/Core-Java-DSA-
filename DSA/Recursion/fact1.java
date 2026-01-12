
// public class fact1 {
//     public static void main(String[] args) {
//         int n = 5;
//         int ans = factorial(n);
//         System.out.println(ans);
//     }
//     // Factorial of a number using recursion
//     static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
// }
// Output: 120

/*public class Factorial {
    static int factorial(int n) {
        if (n == 0) return 1;        // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
 */
//INFINITE LOOP
//Stack Overflow 
//But Why 
//TODO
public class fact1 {

    public static void main(String[] args) {
        print(4);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        print(n--);       //output:StackOverflow
        //  print(--n);    //output:4 3 2 1
        //  print(n-1);    //output:4 3 2 1

    }
}
