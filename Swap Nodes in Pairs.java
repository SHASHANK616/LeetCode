/*Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying 
the values in the list's nodes (i.e., only nodes themselves may be changed.)*/

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
    public ListNode swapPairs(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode p1 = head;
       ListNode p2 = head.next;
       while(p2 != null && p1 != null){
            int temp = p1.val;
            p1.val = p2.val;
            p2.val = temp;
            if(p2.next != null){
                p1 = p2.next;
                p2 = p1.next;
            }
            else{
                break;
            }
       }
       return head;
    }
} 
