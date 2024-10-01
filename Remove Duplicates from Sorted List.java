/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if (curr == null)
            return head;
        else {
            while (curr.next != null) {
                if (curr.val == curr.next.val)curr.next = curr.next.next;
                     else {
                    curr = curr.next;
                }
            }
        }

        return head;
    }
}
