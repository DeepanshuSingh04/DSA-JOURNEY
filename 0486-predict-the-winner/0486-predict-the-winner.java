class Solution {
    public boolean predictTheWinner(int[] nums) {
        int diff = solve(nums, 0, nums.length - 1);
        return diff >= 0;
    }
    
    private int solve(int[] nums, int left, int right) {
        // Base case: sirf ek number bacha hai
        if (left == right) {
            return nums[left];
        }
        
        // Left wala number lene ka case
        int pickLeft = nums[left] - solve(nums, left + 1, right);
        
        // Right wala number lene ka case
        int pickRight = nums[right] - solve(nums, left, right - 1);
        
        // Jo bhi better (max) hai wo return karo
        return Math.max(pickLeft, pickRight);
    }
}