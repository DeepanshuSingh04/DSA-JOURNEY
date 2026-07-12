class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length; 
        if(n == 1) return 0;  //first edge case

        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + nums[i];
        }

        int[] suf = new int[n];
        suf[n-1] = nums[n-1];
        for(int i=n-2; i>0; i--){
            suf[i] = suf[i+1] + nums[i];
        }

        if(suf[1] == 0) return 0;  //second EC

        for(int i=1; i<n-1; i++){  //third EC
            if(pre[i-1] == suf[i+1])
            return i;
        }
        for(int i=1; i<n; i++){
            if(pre[i]==suf[i]) return i;
        }
        return -1;
    }
}