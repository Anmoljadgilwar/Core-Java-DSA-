
public class StrBuild {

    public static void main(String[] args) {
        int n = 100_000;

// String
        long t1 = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
        long t2 = System.nanoTime();

// StringBuilder
        long t3 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        sb.toString();
        long t4 = System.nanoTime();

        System.out.println("String time: " + (t2 - t1));
        System.out.println("Builder time: " + (t4 - t3));
    }
}
