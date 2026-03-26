
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    //time complexity O(1)
    public void insert(int val) {
        Node newNode = new Node(val);

        if (head == null) { // corner case
            head = newNode;
            tail = newNode;
            newNode.next = head; // important for circular
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // 🔥 DELETE METHOD
    public void delete(int val) {

        // ❌ Case 1: Empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // ❌ Case 2: Only one node
        if (head == tail && head.data == val) {
            head = tail = null;
            return;
        }

        Node curr = head;
        Node prev = tail;

        do {
            // ✅ Node found
            if (curr.data == val) {

                // 🟡 Case 3: Deleting head
                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } // 🟡 Case 4: Deleting tail
                else if (curr == tail) {
                    prev.next = head;
                    tail = prev;
                } // 🟡 Case 5: Middle node
                else {
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Value not found");
    }

    // time complexity O(n)
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.delete(3);

        cll.print();
    }
}
