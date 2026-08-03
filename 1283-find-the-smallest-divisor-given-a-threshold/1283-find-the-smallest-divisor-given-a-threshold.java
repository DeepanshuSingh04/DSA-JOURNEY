class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int ele : nums){
            max = Math.max(max,ele);
        }
        int lo = 1, hi = max, ans = max;
        while(lo <= hi){   
            int mid = lo + (hi-lo)/2;
            if(findSum(mid,nums) <= threshold){
                hi = mid-1;
                ans = mid;
            }
            else lo = mid +1 ;
        }
        return ans;
    }

    private int findSum(int divisor, int[] arr){
        int sum = 0;
        for(int ele : arr){
//ceiling divison           
           sum += (ele + divisor -1) / divisor;

        }
        return  sum;
    }
}

//this way of finding ceiling is even faster than (Math.ceil())