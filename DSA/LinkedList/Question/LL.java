
public class LL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // Recursive insert
    // Wrapper method (important)
    public void insertRecursive(int data, int pos) {
        head = insertAtPosition(head, data, pos);
    }

    void print() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.insertRecursive(5, 0);
        list.insertRecursive(4, 1);
        list.insertRecursive(10, 1); // test middle insert

        list.print();
    }
}
