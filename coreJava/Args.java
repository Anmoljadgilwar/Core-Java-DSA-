
import java.util.Arrays;

public class Args {

    public static void main(String[] args) {

        fun(654, 54, 54, 64, 5, 552, 11, 5);
    }

    static void fun(int... a) {
        System.out.println(Arrays.toString(a));
    }
}
