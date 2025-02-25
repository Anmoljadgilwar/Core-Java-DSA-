
import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Print elements
        System.out.println("Fruits: " + fruits);

        // Get an element
        System.out.println("First fruit: " + fruits.get(0));

        // Remove an element
        fruits.remove("Cherry");

        // Print updated list
        // Loop through the list
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Size of the list
        System.out.println("Total fruits: " + fruits.size());

        //Replace an element
        fruits.set(0, "Guava");
        System.out.println(fruits);
    }
}
