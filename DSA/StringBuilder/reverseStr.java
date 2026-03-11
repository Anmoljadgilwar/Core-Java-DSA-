
public class reverseStr {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hari Bol");
        System.out.println(str.reverse());

        String str2 = "Ram";
        for (int i = str2.length() - 1; i >= 0; i--) {
            System.out.print(str2.charAt(i));
        }
    }

}
