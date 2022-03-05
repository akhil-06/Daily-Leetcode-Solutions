class Solution {
    public int deleteAndEarn(int[] nums) {
        //given range
        int sum[] = new int[10001];
        //we are making the array which has nums ka sum stored
        for(int i=0;i<nums.length;i++){
            sum[nums[i]] += nums[i];
        }
        
        sum[0] = 0;
        sum[1] = Math.max(sum[1],sum[0]);
        
        for(int i=2;i<sum.length;i++){
 // In the question we are asked to remove nums[i] - 1 and nums[i] + 1 if nums[i] is selected.
 // You will notice that the condition to fill dp[] looks a little different.
 // Every element can either be picked or deleted. Deleted here means that nums[i] - 1 got picked and as a result
// current element is being removed, this is indicated by max(dp[i - 1], ...).
 // If the current element is picked, then we will get all its points + solution of dp[i - 2]
 // hence, max (..., totalPointsForNum[i] + dp[i - 2])
            
// In bottomup approach of DP it is important to create solutions based on previous (past) solutions.
 // You cannot rely on a future solution. Coming back to the question, we have the same problem
 // How do we handle removal of element nums[i] + 1 ??
// That will be handled later on i.e when we solve dp[nums[i] + 1] we will consider two scenarios:
// 1. It got removed because we picked nums[i] - 1 or 
// 2. It got picked which will be counted with the subsolution of dp[i - 2].
			
            sum[i] = Math.max(sum[i-1],sum[i-2]+sum[i]);
        }
        return sum[10000];
    }
}