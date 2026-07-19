class Solution {
    public int maxProduct(int[] arr) {
        int currPro = 1, maxPro = Integer.MIN_VALUE, n = arr.length;
        for(int i=0; i<n; i++){
            currPro *= arr[i];
            maxPro = Math.max(currPro,maxPro);
            if(currPro == 0) currPro = 1;
        }
        currPro = 1;
        for(int i=n-1; i>=0; i--){
            currPro *= arr[i];
            maxPro = Math.max(maxPro,currPro);
            if(currPro == 0) currPro = 1;
        }
        return maxPro;
    }
}