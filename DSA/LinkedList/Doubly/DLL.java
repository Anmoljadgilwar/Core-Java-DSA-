
class DoublyLinkedList {

    // Node structure
    static class Node {

        int data;
        Node prev; // points to previous node
        Node next; // points to next node

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Link new node with current head
        newNode.next = head;
        head.prev = newNode;

        // Move head to new node
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Traverse to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach new node
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Print forward
    void printForward() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(4);
        dll.insertAtBeginning(3);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(1);
        dll.insertAtEnd(6);
        dll.printForward();
    }
}
