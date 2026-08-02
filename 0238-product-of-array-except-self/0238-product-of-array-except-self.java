class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        int[] ans = new int[n];
        pre[0] = arr[0];
        suff[n-1] = arr[n-1];

//prefix product array(left se)
        for(int i=1; i<n; i++){
            pre[i] = arr[i]*pre[i-1];
        }

// suffix product array(right se)
        for(int i=n-2; i>0; i--){
            suff[i] = suff[i+1]*arr[i];
        }

        for(int i=0 ; i<n ;i++){
            if( i == 0){
                ans[i] = suff[1];
            }
            else if( i == n-1){
                ans[i] = pre[n-2];
            }
            else{
                ans[i] = pre[i-1]*suff[i+1];
            }
        }
        return ans ;
    }
}


// tle error

// class Solution {
//     public int[] productExceptSelf(int[] arr) {
//         int n = arr.length;
//         int[] ans = new int[n];

//         for(int i=0; i<n; i++){
//         int product = 1;

//             for(int j=0; j<n; j++){
//                 if(i != j){
//                     product *= arr[j];
//                 }
//             }
//             ans[i] = product;
//         }
//         return ans;
//     }
// }