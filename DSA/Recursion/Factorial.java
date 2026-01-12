
public class Factorial {

    public static void main(String[] args) {

        int n = 4;
        // int ans = fact(n);
        System.out.println(fact(n));
    }

    static int fact(int n) {

        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }
}

//execution:
//4*fact(3)
//4*3*fact(2)
//4*3*2*fact(1)
//4*3*2*1
//24
