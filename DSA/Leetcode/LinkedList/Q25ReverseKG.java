//leetcode 25. Reverse Nodes in k-Group
//description: Given a linked list, reverse the nodes of a linked list k at a time and return its modified list. k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

//example:
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]
//input: head = [1,2,3,4,5], k = 3
//Output: [3,2,1,4,5]
public class Q25ReverseKG {

}

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        // Create a dummy node to act as the head of the result list.
        // This simplifies handling the first group reversal.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // groupPrev will always point to the node immediately before the current group
        ListNode groupPrev = dummy;

        while (true) { //infinite while loop until we break
            // Step 1: Find the kth node (the end of the current group)
            ListNode kth = getKthNode(groupPrev, k);

            // If we don't have k nodes left, we stop and return the result
            if (kth == null) {
                break;
            }

            // Step 2: Identify the start of the next group
            ListNode groupNext = kth.next;

            // Step 3: Reverse the current group (from groupPrev.next to kth)
            ListNode prev = kth.next; // The node after the group (will be the next of the new tail)
            ListNode curr = groupPrev.next; // Start of the current group

            // Standard linked list reversal logic
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // Step 4: Reconnect the reversed group
            // The original start of the group is now the tail of the reversed group
            ListNode originalStart = groupPrev.next;

            // Connect the previous part of the list to the new head of the reversed group
            groupPrev.next = prev;

            // Connect the new tail of the reversed group to the next group
            originalStart.next = groupNext;

            // Step 5: Move groupPrev to the end of the current group (which is originalStart)
            // to prepare for the next iteration
            groupPrev = originalStart;
        }

        return dummy.next;
    }

    // Helper method to find the kth node starting from 'current'
    // Returns null if there are fewer than k nodes remaining
    private ListNode getKthNode(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }
}
