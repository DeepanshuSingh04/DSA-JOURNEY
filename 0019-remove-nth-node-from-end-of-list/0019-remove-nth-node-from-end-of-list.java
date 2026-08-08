class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // fast ko k+1 steps aage le jao
        for(int i=1; i<=k+1; i++){
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){         // ab fast or slow ko iktha aage badhao
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}


// anther my thinking approach

// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int k) {
//         ListNode slow  = head;
//         ListNode fast = head;
//         for(int i=1; i<=k; i++){
//             if(fast == null)
//             return -1;
//             fast = fast.next;
//         }
// // k == length
//         if(fast == null) return head.next;
//         while(fast.next != null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;
//         return head;
//     }
// }
