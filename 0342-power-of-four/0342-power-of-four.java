class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}


// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return isPowerOfTwo(n) && isSquare(n);
//     }
//     boolean isPowerOfTwo(int n) {
//         if (n <= 0) return false;
//         return (n & (n - 1)) == 0;
//     }
//     boolean isSquare(int n) {
//         int root = (int) Math.sqrt(n);
//         return root * root == n;
//     }
// }


// class Solution {
//     public boolean isPowerOfFour(int n) {
//         if(n<1) return false;
//         while(n%4 == 0){
//             n /= 4;
//         }
//         return n==1;
//     }
// }