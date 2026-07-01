class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];

        for (int i = 0; i < n1; i++) {

            ans[i] = -1; // Default answer

            // nums1[i] ko nums2 me dhoondo
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    // Match mil gaya, ab j+1 se next greater dhoondo
                    for (int k = j + 1; k < n2; k++) {
                        if (nums2[k] > nums1[i]) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                    // nums2 me element unique hai, isliye bahar aa jao
                    break;
                }
            }
        }
        return ans;
    }
}