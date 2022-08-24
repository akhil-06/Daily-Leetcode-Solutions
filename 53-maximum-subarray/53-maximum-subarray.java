class Solution {
    public int maxSubArray(int[] nums) {
       //kadanes's Algorithum
       int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            max = Math.max(max,sum);
            
            if(sum < 0)
                sum =0;
        }
        return max;
        
        
        
        //one way to solve this
//         if (nums.length == 1) {
//             return nums[0];
//         }
        
//         int maxSum = Integer.MIN_VALUE;
//         int currentMaxSum = Integer.MIN_VALUE;
//         int startIndex = 0;
//         int endIndex = 0; 
//         int s = 0;
        
//         for (int j = 0; j < nums.length; j++) {
//             for (int i = j; i < nums.length; i++) {
//                 s = s + nums[i];
//                 if (s > currentMaxSum) {
//                     currentMaxSum = s; 
//                     startIndex = j;
//                     endIndex = i;
//                 }
//             }
//             if (currentMaxSum >= maxSum) {
//                 maxSum = currentMaxSum;
//             }
//             currentMaxSum = Integer.MIN_VALUE;
//             s = 0;
//         }
        
//         return maxSum;        
    }
}