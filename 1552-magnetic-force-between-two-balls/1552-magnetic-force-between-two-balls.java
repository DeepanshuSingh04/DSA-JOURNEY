class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int lo=1 , hi = position[position.length-1] - position[0], ans = 0 ;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(canPlace(position, m, mid)){
                lo = mid+1;
                ans = mid;
            }
            else hi = mid -1;
        }
        return ans;
    }

// Ye function sirf ye check kega ki Kya minimum distance = mid rakhte hue sab cows place ho sakti hain?

    private boolean canPlace(int[] arr, int k, int dist){
        int count = 1;
        int lastPlaced = arr[0];
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] - lastPlaced >= dist){
                count++;
                lastPlaced = arr[i];
            }
            
            if(count == k) return true;
        }
        return false;
    }
}