/*Given the head of a singly linked list and two integers 
left and right where left <= right, reverse the nodes of the 
list from position left to position right, and return the reversed list.*/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if(head == null || left == right) return head;  
      else{
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        for(int i= 1; i<left; i++)prev = prev.next;
         current  = prev.next;

        ListNode fast = null;
        ListNode prevRight = null;
        for(int i= 0; i<(right-left)+1; i++){
            fast = current.next;
            current.next = prevRight;
            prevRight = current;
            current = fast;
        }
        prev.next.next = current;
        prev.next = prevRight;
        return dummy.next;
      }
    }
} 
