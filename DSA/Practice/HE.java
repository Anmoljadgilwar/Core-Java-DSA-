
public class HE {

    public static void main(String[] args) {
        int count = 0;
        int n = 1000;
        for (int i = 0; i * i < n; i++) {
            count++;
        }
        System.out.println(count);
    }
}
