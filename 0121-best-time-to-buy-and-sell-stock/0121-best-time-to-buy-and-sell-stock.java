class Solution {
    public int maxProfit(int[] arr) {
        int i = 0, j=0;
        int n = arr.length-1;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(i=0; i<arr.length; i++){
            if(arr[i] < minPrice){
              minPrice = arr[i];
            }
            else {
                int profit = arr[i]-minPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}