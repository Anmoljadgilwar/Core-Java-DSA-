
import java.util.Scanner;

class method {

    public static void main(String[] args) {
        // method obj = new method();
        // obj.Add();
        int ans = Add2();
        System.out.println("Sum the of two numbers is " + ans);
    }

    public static void Add() {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
    }

    static int Add2() {
        int a2, b2, sum2;
        Scanner sc = new Scanner(System.in);
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        sum2 = a2 + b2;
        return sum2;
    }
}

/* public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a, b, sum;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            sum = a + b;
            System.out.println("Sum of two numbers is " + sum);
        }
    }
}
 */
