/*Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 */

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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        List<Integer> arr = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            arr.add(current.val);
            current = current.next;
        }
        int i=0, j= arr.size()-1;
        while(i<j){
            if(!arr.get(i).equals(arr.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
