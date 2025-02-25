
public class NumPyramid {

    public static void main(String[] args) {

        int i, j, num = 6;

        for (i = 0; i < num; i++) {
            for (j = 0; j < num - i; j++) {
                System.err.print(" ");
            }

            for (j = 0; j < i; j++) {
                System.err.print(i + " ");
            }
            System.err.println();
        }
    }

}
