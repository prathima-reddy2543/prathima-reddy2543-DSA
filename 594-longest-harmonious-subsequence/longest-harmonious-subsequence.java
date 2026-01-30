class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int l = 0;
        int ans = 0;

        for (int r = 0; r < nums.length; r++) {
            // shrink window if difference > 1
            while (nums[r] - nums[l] > 1) {
                l++;
            }

            // valid harmonious window
            if (nums[r] - nums[l] == 1) {
                ans = Math.max(ans, r - l + 1);
            }
        }
        return ans;
    }
}
