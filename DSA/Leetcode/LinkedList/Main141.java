//141. 
// 1. Define the ListNode class (LeetCode hides this part)

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// 2. Your Solution class with a main method added
public class Main141 {

    // Your original method
    public boolean hasCycle(ListNode head) {
        // Edge case: empty list or single node
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;   // moves 1 step
        ListNode fast = head;   // moves 2 steps

        while (fast != null && fast.next != null) {
            slow = slow.next;         // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {       // they met = cycle exists!
                return true;
            }
        }

        return false; // fast reached null = no cycle
    }

    // 3. The main method to test your code
    public static void main(String[] args) {
        Main141 solution = new Main141();

        System.out.println("--- Test Case 1: List WITH a cycle ---");
        // Create nodes: 3 -> 2 -> 0 -> -4
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // Connect nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create a cycle: Connect the last node (-4) back to the second node (2)
        node4.next = node2;

        // Test and print
        boolean result1 = solution.hasCycle(node1);
        System.out.println("Has cycle? " + result1); // Expected: true

        System.out.println("\n--- Test Case 2: List WITHOUT a cycle ---");
        // Create nodes: 1 -> 2 -> 3
        ListNode nodeA = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);

        // Connect nodes normally (no looping back)
        nodeA.next = nodeB;
        nodeB.next = nodeC;

        // Test and print
        boolean result2 = solution.hasCycle(nodeA);
        System.out.println("Has cycle? " + result2); // Expected: false
    }
}
