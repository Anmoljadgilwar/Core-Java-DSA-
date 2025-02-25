
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 4, 5, 6};

        change(arr);

        //print the array
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 108;
    }

}
