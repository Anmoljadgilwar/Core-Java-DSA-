// Node class

class Node {

    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

// Linked List class
class LinkedList {

    Node head;

    // Insert at end
    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println(value + " inserted.");
    }

    // Delete a node by value
    void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head needs to be deleted
        if (head.data == value) {
            head = head.next;
            System.out.println(value + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println(value + " deleted.");
        }
    }

    // Traverse (Display)
    void traverse() {
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
}

// Main class
public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Insertion
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Traversal
        list.traverse();

        // Deletion
        list.delete(20);

        // Traversal after deletion
        list.traverse();
    }
}

/*
10 inserted.
20 inserted.
30 inserted.
Linked List: 10 -> 20 -> 30 -> null
20 deleted.
Linked List: 10 -> 30 -> null
*/
