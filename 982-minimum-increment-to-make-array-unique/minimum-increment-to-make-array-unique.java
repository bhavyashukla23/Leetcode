class Solution {
    public int minIncrementForUnique(int[] nums) {
         Arrays.sort(nums);
        int ctr = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ctr += (nums[i - 1] - nums[i] + 1);
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ctr;
    }
}