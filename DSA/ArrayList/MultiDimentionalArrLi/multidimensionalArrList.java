
import java.util.ArrayList;

public class multidimensionalArrList {

    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Adding rows (inner ArrayLists)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());  // Each row is an ArrayList
        }

        // Adding elements to the inner ArrayLists
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(2).add(5);
        list.get(2).add(6);

        // Printing the 2D ArrayList
        System.out.println(list + "\n");

    }

}
