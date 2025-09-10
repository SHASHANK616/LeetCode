/*Given the head of a linked list, rotate the list to the right by k places.*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k ==0 || head.next == null) return head;
        ListNode tail = head;
        int len =1;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        tail.next = head;
        k = k%len;
        int stepToHead = len - k;
        ListNode newTail = tail;

        while(stepToHead-- > 0){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
