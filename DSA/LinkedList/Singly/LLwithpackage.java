
import java.util.LinkedList;

public class LLwithpackage {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("am"); //adds node at the end
        list.addFirst("I");
        list.addLast("in");
        list.add("Love");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());

        //traverse
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        //
        list.removeFirst(); //removes first node
        list.removeLast(); //removes last node
        list.remove();    //removes first node
        // list.remove(2);
        System.out.println(list);
    }
}

//output:
//[I, am, in, Love]
// I
// 4
// I -> am -> in -> Love -> NULL
// [in]

