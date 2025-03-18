
public class RightFace {

    public static void main(String[] args) {

        int i, j;

        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//System.out.print(i);
// 1
// 22
// 333
// 4444
// System.out.print(j);
// 1
// 12
// 123
// 1234
