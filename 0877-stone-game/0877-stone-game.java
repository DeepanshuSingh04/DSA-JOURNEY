class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] memo = new Integer[n][n];
        int diff = solve(piles, 0, n - 1, memo);
        return diff > 0;   // Alice jeetegi agar diff positive hai (tie possible nahi)
    }
    
    private int solve(int[] piles, int left, int right, Integer[][] memo) {
        // Base case: sirf ek pile bacha hai
        if (left == right) {
            return piles[left];
        }
        if (memo[left][right] != null) {
            return memo[left][right];
        }
        
        // Left wali pile lene ka case
        int pickLeft = piles[left] - solve(piles, left + 1, right, memo);
        
        // Right wali pile lene ka case
        int pickRight = piles[right] - solve(piles, left, right - 1, memo);
        
        memo[left][right] = Math.max(pickLeft, pickRight);
        return memo[left][right];
    }
}