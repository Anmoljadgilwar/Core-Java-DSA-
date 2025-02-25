
public class PConstructor {

    int x, y;

    PConstructor(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        PConstructor obj = new PConstructor(100, 400);
        obj.show();
    }
}
