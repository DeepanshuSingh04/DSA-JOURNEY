class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int n = nums.length;
        while (even < n && odd < n) {
//if even number at even place  found             
            if (nums[even] % 2 == 0) {
                even += 2;
            }
//if odd number at odd place found           
             else if (nums[odd] % 2 == 1) {
                odd += 2;
            } 
//and if even place pr odd hua or odd place pr even number
            else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;

                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
}

//we will add 2 evertime in indexes so that keeps moving in odd and even respectives indexes