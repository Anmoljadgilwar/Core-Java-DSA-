
class Solution {

    public ListNode deleteDuplicates(ListNode head) {

        // 2. Start our traveler at the beginning 🚶‍♂️
        ListNode current = head;

        // 3. Keep going until we hit the end of the trail 🌲
        while (current != null && current.next != null) {
            // 4. Check if the neighbor is a twin 👥
            if (current.val == current.next.val) {
                // 5. Found a twin! Skip over them ✂️
                current.next = current.next.next;
            } else {
                // 6. No twin? Move to the next person 🚶‍♂️
                current = current.next;
            }
        }

        // 7. Return the cleaned-up list 🏆
        return head;
    }
}

// complexity:
// time: O(n)
// space: O(1)
