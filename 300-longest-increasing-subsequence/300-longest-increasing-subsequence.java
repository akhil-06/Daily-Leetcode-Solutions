class Solution {
    
     public int lengthOfLIS(int[] nums) {
     TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer x=set.ceiling(nums[i]);
            if(x!=null)
            {
                set.remove(x);
            }
            set.add(nums[i]);
        }
        return set.size();
}
    
        // //Tc is n2 and SC is n
        // public int lengthOfLIS(int[] nums) {
        // if (nums == null | nums.length == 0){
        // return 0;
        // }
        // int n = nums.length, len = 0, max = 1;   
        // int[]dp = new int[n];
        // //just initialize 1st element by 1
        // dp[0] = 1;
        // //loop till n
        // for(int i=1;i<n;i++){
        // //make dp as filled by 1
        // dp[i]=1;
        // for(int j=0;j<i;j++){
        // //1st condition for checking subseqnebce 
        // //2nd is for make subsequence valid 
        // if(nums[i]>nums[j] && dp[i]<=dp[j]){
        // dp[i] = 1 + dp[j];
        // //to return int ans , we maintain max 
        // max=Math.max(dp[i],max);
        // }
        // }
        // }
        // return max;
        // }
    
//     public int lengthOfLIS(int[] nums) {
//         return LISHelper(-1, 0, nums);
//     }
    
//     private static int LISHelper(int prev, int curr, int nums[]){
//         if(curr == nums.length) return 0;
        
//         int op1 = 0;
//         if(prev == -1 || nums[prev] < nums[curr]){
//             op1 =  1 + LISHelper(curr, curr+1,nums);
//         }        
//         int op2 = LISHelper(prev, curr+1,nums);
       
//         return Math.max(op1, op2);
//     }
}