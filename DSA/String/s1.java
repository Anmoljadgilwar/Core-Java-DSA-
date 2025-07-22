
public class s1 {

    public static void main(String[] args) {
        String a1 = "Hello";
        String a2 = "Hello";
        String s2 = new String("Helloji");
        String s4 = new String("Helloji");

        System.out.println(s4 == s2); // false
        System.out.println(a1 == a2); // true
        System.out.println(s2.equals(s4)); // true
    }
}
