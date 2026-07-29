class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int ele : piles){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, speed = max;
        while(lo <= hi){            //O(n*log(max))
            int mid = lo + (hi-lo)/2;
            if(hours(mid,piles) <= h){
                hi = mid-1;
                speed = mid;
            }
            else lo = mid +1 ;
        }
        return speed;
    }

    private long hours(int speed, int[] arr){
        long h = 0;
        for(int ele : arr){
            if(ele%speed == 0) h += ele/speed;
            else h += (ele/speed + 1);
        }
        return  h;
    }
}