
public class LL {

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add first in linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last - uses current node traversal as noted
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

    // Print linked list
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
// Delete first node in linked list

    public void deleteFirst() {
        if (head == null) { //cornar case: empty list
            // return; or
            System.out.println("List is empty, nothing to delete");
        }
        size--;
        head = head.next; // Move head to the next node
    }

// Delete last node in linked list
    public void deleteLast() {
        if (head == null) { //cornar case: empty list
            // return; or
            System.out.println("List is empty, nothing to delete");
        }
        size--;
        if (head.next == null) { //cornar case: only one node in the list
            head = null; // Set head to null, effectively deleting the only node
            return;
        }
        //     Node secondLast = head;
        //     Node lastNode = head.next;
        //     while (lastNode.next != null) {
        //         lastNode = lastNode.next;
        //         secondLast = secondLast.next;
        //     }
        //     secondLast.next = null;
        //SIMPLE VERSION
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null; // delete last node
        /*
            temp → current node
            temp.next → next node
            temp.next.next → node after next
         */
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("in");
        list.addLast("Love");
        list.printList();  // Output: I -> am -> in -> Love -> null

        list.deleteLast();
        list.printList(); // Output: I -> am -> in -> null

        System.out.println("Size of the list: " + list.getSize());
    }
}
