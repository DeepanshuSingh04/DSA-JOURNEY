class Solution {
    public long gcdSum(int[] arr) {
        int n = arr.length;
        int[] prefixGcd = new int[n];
        int currentMax = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>currentMax){ 
            currentMax = arr[i];
            }
            prefixGcd[i] = gcd(arr[i], currentMax);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        int i = 0, j = n - 1 ;
        while(i<j){
           sum = sum +  gcd(prefixGcd[i] , prefixGcd[j]);
           i++;
           j--;
        }
        return sum;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}