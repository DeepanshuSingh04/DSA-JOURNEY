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
    public ListNode doubleIt(ListNode head) {
       ListNode a =  reverseList(head);
       int carry = 0;
       int newVal = 0;
       ListNode temp = a;
       ListNode prev = null;
       while(temp != null){
            newVal =  temp.val*2 + carry;
            temp.val = newVal%10;
            carry = newVal/10;
            prev = temp;
            temp = temp.next;
       }
       if(carry>0){
        ListNode b = new ListNode(carry);
        prev.next = b;
       }
       return reverseList(a);
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = head; // it can be on null also
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
}