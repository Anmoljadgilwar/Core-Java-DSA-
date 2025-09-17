
public class StringSearch {

    public static void main(String[] args) {
        String name = "Gour Hari";
        char target = 'a';  //ONLY Single Quotes used in char
        System.out.println(search(name, target));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {

                System.out.println(i);
                return true;
            }
        }
        return false;
    }
}
