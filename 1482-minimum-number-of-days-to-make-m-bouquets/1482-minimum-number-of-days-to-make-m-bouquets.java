class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length)
        return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int ele : bloomDay){
            max = Math.max(max,ele);
            min = Math.min(min,ele);
        }

        int lo = min, hi = max, ans = -1;

        while(lo <= hi){       
            int mid = lo + (hi-lo)/2;
            if(canMake(m,k,mid,bloomDay)){
                hi = mid-1;
                ans = mid;
            }
            else lo = mid +1 ;
        }
        return ans;
    }

    private boolean canMake(int m, int k, int day,int[] bloomDay){
        int flowers = 0;
        int bouquets = 0;

        for(int ele : bloomDay){
            if(ele <= day){
                flowers++;
            }else {
                bouquets += flowers/k;
                flowers = 0;
            }
        }
        bouquets += flowers/k ;

        return bouquets >= m ;
    }
}