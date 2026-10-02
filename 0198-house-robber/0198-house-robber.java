import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        // 2 states:
        // 0 = previous house not robbed
        // 1 = previous house robbed
        int[][] dp = new int[n][2];

        // -1 means not calculated
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(nums, 0, 0, dp);
    }

    public int solve(int[] nums, int i, int prevRobbed, int[][] dp) {

        // No houses left
        if (i >= nums.length) {
            return 0;
        }

        // Already calculated
        if (dp[i][prevRobbed] != -1) {
            return dp[i][prevRobbed];
        }

        // Option 1: Skip current house
        int skip = solve(nums, i + 1, 0, dp);

        int rob = 0;

        // We can rob current only if previous was NOT robbed
        if (prevRobbed == 0) {

            rob = nums[i] + solve(nums, i + 1, 1, dp);
        }

        
        dp[i][prevRobbed] = Math.max(rob, skip);

        return dp[i][prevRobbed];
    }
}