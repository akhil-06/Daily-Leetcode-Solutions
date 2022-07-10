class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int dp[] = new int[cost.length];
        // dp[0] = cost[0];
        // dp[1] = cost[1];
        for(int i=2;i<cost.length;i++){
            cost[i] = cost[i] + Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-2],cost[cost.length-1]);
    }
}

