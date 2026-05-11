
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
    // Wrapper updates head
    public void insertRecursive(int data, int pos) {
        head = insertRecursive(head, data, pos, 0);
    }

// Actual recursive helper (returns new head)
    private Node insertRecursive(Node head, int data, int pos, int currPos) {
        if (head == null || currPos == pos) {
            Node newNode = new Node(data);
            newNode.next = head;
            return newNode;
        }
        head.next = insertRecursive(head.next, data, pos, currPos + 1);
        return head;
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
