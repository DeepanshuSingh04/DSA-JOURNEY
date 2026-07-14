class Solution {
    public int countPrimes(int n) {
        int count = 0;
        int[] s = seive(n);
        for(int i=1; i<n; i++){
        if(s[i]==1) count++;
        }
        return count;
    }   

    public int[] seive(int n){//TC=O(n*log(logn))
        int[] arr = new int[n+1];
        Arrays.fill(arr,1);

        if(n >= 0) arr[0] = 0;
        if(n >= 1) arr[1] = 0;

        for(int i=2; i*i<=n; i++){
            if(arr[i] == 1){      // i is prime
               for(int j=i*i; j<=n; j+=i){
                arr[j] = 0;  //composite
               }
            }
        }
        return arr;
    }
}