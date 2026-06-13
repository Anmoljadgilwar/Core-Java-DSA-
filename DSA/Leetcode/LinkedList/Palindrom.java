
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int val) {
//         this.val = val;
//     }
// }
// public class Palindrom {
//     public boolean isPalindrome(ListNode head) {
//         if (head == null || head.next == null) {   //edge case
//             return true;
//         }
//         // 1. Find the middle
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         // 2. Reverse the second half
//         ListNode prev = null;
//         ListNode current = slow;
//         while (current != null) {
//             ListNode nextNode = current.next;
//             current.next = prev;
//             prev = current;
//             current = nextNode;
//         }
//         // 3. Compare halves
//         ListNode left = head;
//         ListNode right = prev; // Head of the reversed second half
//         while (right != null) {
//             if (left.val != right.val) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }
// }
class Node {

    int data;
    Node next;

    Node(int val) {
        this.val = data;
    }
}

class Palindrom {

    public static void main(String[] args) {

    }
}
