
public class firstR {

    public static void main(String[] args) {
        RLoop(6);
    }

    static void RLoop(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        RLoop(n - 1);
        //System.out.println(n);
    }
}
