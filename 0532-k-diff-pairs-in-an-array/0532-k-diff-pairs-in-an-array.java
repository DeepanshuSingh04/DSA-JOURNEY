class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        for (int num : map.keySet()) {
            if (k == 0) {
                if (map.get(num) > 1)
                    pairs++;
            } else {
                if (map.containsKey(num + k))
                    pairs++;
            }
        }
        return pairs;
    }
}