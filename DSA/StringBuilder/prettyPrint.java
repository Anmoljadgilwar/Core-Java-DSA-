
public class prettyPrint {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
