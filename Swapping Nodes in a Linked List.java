/*You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
*/

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode beg = head;
        int len = 0;
        for (int i = 1; i < k; i++) {
            beg = beg.next;
        }
        
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        ListNode endNode = head;
        for (int i = 1; i < (len - k + 1); i++) {
            endNode = endNode.next;
        }

        int temp = beg.val;
        beg.val = endNode.val;
        endNode.val = temp;

        return head;
    }
}
