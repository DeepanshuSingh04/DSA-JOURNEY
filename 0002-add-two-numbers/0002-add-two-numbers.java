class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode t1 = head1;
        ListNode t2 = head2;

        int carry = 0;

        //dummy node
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        //add two number
        while(t1 != null || t2 != null || carry != 0){
           int sum = carry;

           if(t1 != null){
            sum += t1.val;
            t1 = t1.next;
           }
           if(t2 != null){
            sum += t2.val;
            t2 = t2.next;
           }

           carry = sum/10;
           int digit = sum%10;
           tail.next = new ListNode(digit);
           tail = tail.next;
        }

        return dummy.next;
    }
}
