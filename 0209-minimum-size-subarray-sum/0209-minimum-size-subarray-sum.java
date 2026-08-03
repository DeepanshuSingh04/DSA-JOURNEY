class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum = 0, mini = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while (j < nums.length) {
            currSum += nums[j];

            while (currSum >= target) {
                int ans = j - i + 1;
                mini = Math.min(mini, ans);

                currSum -= nums[i];
                i++;
            }
            j++;
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}