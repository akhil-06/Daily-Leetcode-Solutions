class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 2) return 0;
        int ans = 0, sum = 0;
        for(int i=2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                //here sum is defining the current possible subaarays
                sum = sum + 1;
                //in ans we are taking sumation of all subarrays
                ans = ans + sum;
                //if situation breaks, then make current subaaray to 0
            }else{
                sum = 0;
            }
        }
        return ans;
    }
}

//dp ans
// int[] dp = new int[arr.length];
//         int ans = 0;
        
//         for(int i = 2; i < arr.length; i++){
            
//             if(arr[i] - arr[i - 1] == arr[i - 1] - arr[i - 2]){
//                 dp[i] = dp[i - 1] + 1;
//                 ans += dp[i];
//             }
//         }
        
//         return ans;