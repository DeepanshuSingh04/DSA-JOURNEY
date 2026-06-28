class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
//find length        
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
//calculate baseSize and extra nodes
        int basesize = len/k ;
        int extra = len%k;

//create Answer array
        ListNode[] ans = new ListNode[k];
        ListNode current = head;

//create every part        
        for(int i=0; i<k; i++){
            if(current == null){
                ans[i] = null;
                continue;
            }
            ans[i] = current;

            int currentPartSize = basesize;

            if(extra>0){
                currentPartSize++;
                extra--;
            }
            for(int j = 1; j< currentPartSize; j++){
                current = current.next;
            }
            ListNode nextPart = current.next;
            current.next = null;
            current = nextPart;
        }
        return ans;
        
    }
}