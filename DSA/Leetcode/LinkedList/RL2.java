// link: https://leetcode.com/problems/reverse-linked-list-ii/

class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        //skip the first left-1 nodes
        ListNode prev = null;
        ListNode curr = head;
        for (int i = 0; curr != null && i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        //reverse between left and right
        ListNode next = curr.next;
        for (int i = 0; curr != null && i < right - left + 1; i++) {

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //   ListNode dummy = new ListNode(-1);
        //   dummy.next = head;
        //   ListNode prev = dummy;
        //   for (int i = 1; i < left; i++) {
        //       prev = prev.next;
        //   }
        //   ListNode curr = prev.next;
        //   for (int i = 0; i < right - left; i++) {
        //       ListNode next = curr.next;
        //       curr.next = next.next;
        //       next.next = prev.next;
        //       prev.next = next;
        //   }
        //   if (left == 1) {
        //       return dummy.next;
        //   } else {
        //       return head;
        //   }
    }
}

public class RL2 {

}
