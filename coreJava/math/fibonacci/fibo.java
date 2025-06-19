
public class fibo {
//0, 1, 1, 2, 3, 5, 8, 13, 21

    public static void main(String[] args) {

        int n = 10;
        int prev = 0, curr = 1;

        System.out.print(prev + " " + curr);

        for (int i = 2; i < n; i++) {
            int next = prev + curr;
            System.out.print(" " + next);

            prev = curr;
            curr = next;

        }

    }
}
