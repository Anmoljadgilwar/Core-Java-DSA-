
import java.util.*;

public class String1 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();

        System.out.println("Your name is " + name);
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Charecter at index " + i + " is " + name.charAt(i));
        }
    }
}
