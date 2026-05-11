// https://leetcode.com/problems/reorder-list/
// 143. Reorder List
//input list 1->2->3->4->5->null and output 1->5->2->4->3->null

public class Q143 {

}

class Solution {

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        // 1. Find middle
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;

        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // 3. Merge two halves
        ListNode first = head;
        second = prev;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
