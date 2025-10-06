/*Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.*/

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
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int middle = len/2;
        ListNode ans = head;
        while(middle !=0){
            ans = ans.next;
            middle--;
        }
        return ans;
        }
    }
