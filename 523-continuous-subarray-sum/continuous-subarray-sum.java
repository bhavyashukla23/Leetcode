class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
      Map<Integer, Integer> iMap = new HashMap<>();
        iMap.put(0, -1); // To handle the case where the subarray starts from index 0
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;

            if (iMap.containsKey(remainder)) {
                if (i - iMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                iMap.put(remainder, i);
            }
        }

        return false;
    }
}