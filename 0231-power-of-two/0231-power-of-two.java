class Solution {
    public boolean isPowerOfTwo(int n) {
        //using bit 
        if (n <= 0) return false; 
        return ((n & ( n -1))==0);
    }
}


//using while loop

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n <= 0) return false;  //becoz power of 2 is only for positive no.s

//         while (n>1) {
//             if(n%2 == 1) return false ;
//             n /= 2;
//         }
//         return true ;
//     }
// }


// using recursion

// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n <= 0) return false;
//         if(n ==1 )return false;
//         if(n % 2 == 1) return false;
//         return isPowerOfTwo(n/2);
//     }
// }