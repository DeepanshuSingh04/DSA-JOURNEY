class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int count = 0;
            for(int num : nums) {
                if(((num >> i) & 1) == 1) {
                    count++;
                }
            }
            if(count % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}


// using hashmap (not recommended bcoz A.S= O(n))

// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int ele : nums){
//             map.put(ele,map.getOrDefault(ele,0)+1);
//         }
//         for(int a : map.keySet()){
//             int freq = map.get(a);
//             if(freq == 1) return a;
//         }
//         return -1;
//     }
// }