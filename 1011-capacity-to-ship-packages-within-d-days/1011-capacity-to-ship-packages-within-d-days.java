class Solution {
    public int shipWithinDays(int[] arr, int d) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int ele : arr){
            max = Math.max(max,ele);
            sum += ele;
        }
        int lo = max, hi = sum, ans = -1;
        while(lo <= hi){  //O(n*log(sum-max))
            int mid = lo + (hi-lo)/2;
            if(days(mid,arr) <= d){
                hi = mid-1;
                ans = mid;
            }
            else lo = mid +1 ;
        }
        return ans;
    }

    static int days(int capacity, int[] arr){
        int days = 0;
        int c = capacity;
        for(int ele : arr){
            if(c >= ele) {
                c = c-ele; // same day hi load hora
            }
            else{
                days++; // purana din band naya din shurur
                c = capacity - ele;
            }
        }
        days++;  //last wala open din bhi count kra hain
        return days;
    }
}