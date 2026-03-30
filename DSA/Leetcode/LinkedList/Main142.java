
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head, fast = head;

        // Step 1: Find meeting point
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // No cycle found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // start of cycle
    }
}

public class Main142 {

}

/**
 🧪 Why Does This Work?
Let’s say:

Distance from head to start of cycle = a
Distance from start of cycle to meeting point = b
Distance from meeting point back to start of cycle = c
When they meet:

slow traveled: a + b
fast traveled: a + b + c + b = a + 2b + c
Since fast moves 2x faster:

2(a + b) = a + 2b + c
→ 2a + 2b = a + 2b + c
→ a = c

✅ So, the distance from head to cycle start = distance from meeting point to cycle start!

That’s why resetting slow to head and moving both one step at a time makes them meet at the cycle start.
*/
