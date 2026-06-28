class Solution {
    public int maxArea(int[] arr) {
        int i = 0 , j = arr.length-1 ;
        int maxArea = 0;
        while(i<j){
            int width = j-i;
            int currentHeight = Math.min(arr[i], arr[j]);
            int area = width*currentHeight;

            maxArea = Math.max(maxArea, area);

            if(arr[i]>arr[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxArea;
    }
}