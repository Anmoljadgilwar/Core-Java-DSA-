
public class StrBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hari  Bol");
        System.out.println(sb);

        sb.insert(5, "Krushn");
        System.out.println(sb);

        sb.delete(0, 4);
        System.out.println(sb);
    }
}

/*
         StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("World");
        System.out.println(sb);
 */
