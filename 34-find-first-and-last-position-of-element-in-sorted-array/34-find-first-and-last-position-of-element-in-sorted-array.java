class Solution {
    
//     There must be two indices in the array. Which means, we can just simply apply to binary search twice to find each index of the target element.
    
    public int findFirst(int []nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
        //continue searching in the left part
        while(start <= end){
            int mid  = (start + end) / 2;
            
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target){
                // we find the index but we still traverse the left part of array
    //beacuse of line 13
                index = mid;
            }
        }
        return index;
    }
    
        public int findLast(int []nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;
          //continue searching in the right part
        while(start <= end){
            int mid  = (start + end) / 2;
            if(nums[mid] <= target){
                 start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target){
                index = mid;
                  // we find the index but we still traverse the left part of array
    //beacuse of line 34
            }
        }
        return index;
    }
    
    public int[] searchRange(int[] nums, int target) {
      
         int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
       
        
        
       //   int ans[] = new int[2];
       //  int k = 0;
       // for(int i=0;i<nums.length;i++){
       //     if(nums[i] == target){
       //         ans[k] = i;
       //         k++;
       //     }
       // }   
       //  return ans;
    }
}