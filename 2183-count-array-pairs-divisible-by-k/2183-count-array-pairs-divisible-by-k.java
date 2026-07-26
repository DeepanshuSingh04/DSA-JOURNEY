class Solution {
    public long countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        for (int num : nums) {
            int g = gcd(num, k);
            for (int prev : map.keySet()) {
                if ((long) g * prev % k == 0) {
                    ans += map.get(prev);
                }
            }
            map.put(g, map.getOrDefault(g, 0) + 1);
        }
        return ans;
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}