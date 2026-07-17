class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        // Frequency of each number
        int[] freq = new int[max + 1];
        for (int x : nums)
            freq[x]++;

        // exactPairs[g] = number of pairs whose gcd is exactly g
        long[] exactPairs = new long[max + 1];

        // Process from max to 1
        for (int g = max; g >= 1; g--) {

            long count = 0;

            // Count numbers divisible by g
            for (int multiple = g; multiple <= max; multiple += g) {
                count += freq[multiple];
            }

            // Total pairs divisible by g
            long pairs = count * (count - 1) / 2;

            // Remove pairs already counted for multiples
            for (int multiple = 2 * g; multiple <= max; multiple += g) {
                pairs -= exactPairs[multiple];
            }
            exactPairs[g] = pairs;
        }

        // Prefix counts
        long[] prefix = new long[max + 1];

        for (int g = 1; g <= max; g++) {
            prefix[g] = prefix[g - 1] + exactPairs[g];
        }
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            long target = queries[i] + 1;
            int left = 1;
            int right = max;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefix[mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }
            ans[i] = left;
        }
        return ans;
    }
}

// brute force 


// class Solution {
//     public int[] gcdValues(int[] nums, long[] queries) {

//         int n = nums.length;
//         int totalPairs = n * (n - 1) / 2;
//         int[] gcdPairs = new int[totalPairs];
//         int[] ans  = new int[queries.length];

//         int index = 0;
//         for(int i=0; i<n-1; i++){
//             for(int j=i+1; j<n; j++){
//                gcdPairs[index++] = gcd(nums[i], nums[j]);
//             }
//         }
//         Arrays.sort(gcdPairs);

//         for(int i=0; i<queries.length; i++){
//             ans[i] = gcdPairs[(int)queries[i]];
//         }
//         return ans;
//     }

//     public int gcd(int a, int b) {
//         while (b != 0) {
//             int rem = a % b;
//             a = b;
//             b = rem;
//         }
//         return a;
//     }
// }