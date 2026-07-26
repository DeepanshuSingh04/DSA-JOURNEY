class Solution {
    public int maximumProduct(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            //update maximums
            if(arr[i] > max) {
                max3 = max2 ;
                max2 = max;
                max = arr[i];
            }
            else if( arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if( arr[i] > max3){
                max3 = arr[i];
            }

            //update minimums
            if(arr[i] < min) {
                min2 = min;
                min = arr[i];
            }
            else if( arr[i] < min2){
                min2 = arr[i];
            }
        }
        int Prod1 = max * max2 * max3;
        int Prod2 = min * min2 * max;

        return Math.max(Prod1,Prod2);
    }
}

// the prod of three largest digits will be max in case of positive numbers and in case of negative numbers find two most smallest(whose product will be in posiitve and larger number) and then multiply that with max number to get largest three number product