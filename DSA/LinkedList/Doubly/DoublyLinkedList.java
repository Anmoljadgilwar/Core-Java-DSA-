
// Insert → O(1) (both ends)
// Delete → O(n)
class DoublyLinkedList {

    // Node structure 
    //why static class, beacause we don't want to create object
    static class Node {

        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            //by default prev and next are null, So we don't have to write it
        }
    }

    Node head, tail;

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at end (O(1))
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //Insert at specific position
    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }

    //Insert by value
    void insertByValue(int data, int value) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }

    // Delete node by value
    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        // Search node
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        // If head node
        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // list became empty

            }
            return;
        }

        // If tail node
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // Middle node
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
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

    // Print backward
    void printBackward() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(3);
        dll.insertAtBeginning(2);
        dll.insertAtBeginning(10);
        dll.insertAtEnd(4);
        dll.insertAtEnd(5);
        dll.insertAtPosition(6, 3);
        dll.insertByValue(100, 10);

        System.out.println("Forward:");
        dll.printForward();

        System.out.println("Backward:");
        dll.printBackward();

        // dll.delete(3);
        // System.out.println("After deleting 3:");
        // dll.printForward();
    }
}
