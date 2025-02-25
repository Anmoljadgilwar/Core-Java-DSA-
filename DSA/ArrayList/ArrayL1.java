
import java.util.ArrayList;
import java.util.Collections;

public class ArrayL1 {

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
//add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);
        // add element in between
        list.add(0, 1);
        System.out.println(list);
        //replace
        list.set(2, 4);
        System.out.println(list);
        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);
        //size of list
        int size = list.size();
        System.out.println(size);
        //Loops on lists
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //Sorting the list
        list.add(2);
        Collections.sort(list);  //sorting the list in ascending order
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        System.out.println(Collections.min(list)); //also max

    }
}
