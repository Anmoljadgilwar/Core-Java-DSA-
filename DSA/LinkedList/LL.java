
import java.util.LinkedList;

public class LL {

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        //Add operation  -  first, last
        //add first in linked list
        public void addFirst(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //add last
        //never do manipution on head node in add last method. use current node.
        public void addLast(String data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        //Print linked list
        public static void main(String[] args) {

            LL list = new LL(); //list object
            list.addFirst("a");
            list.addFirst("is");
            list.addLast("list");

        }
    }

}
