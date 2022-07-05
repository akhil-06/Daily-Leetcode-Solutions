class Solution {
    
       public int longestConsecutive(int[] nums) {
       HashMap<Integer,Boolean> hm = new HashMap<>();
           for(int i=0;i<nums.length;i++) hm.put(nums[i],true);
           
           for(int i=0;i<nums.length;i++){
               if(hm.containsKey(nums[i]-1)) hm.put(nums[i],false); 
           }
           int max = 0;
           for(Integer key : hm.keySet()){
            if(hm.get(key) == true) 
                max = Math.max(max, findLength(hm, key));
       }
           return max;
    }
    
    private static int findLength(HashMap<Integer, Boolean> hm, int k){
        int ans  = 0;
        while(hm.containsKey(k)){
            ans++;
            k++;
        }
        return ans;
    }
    
    
    
    
    // public int longestConsecutive(int[] nums) {
    //      if (nums.length == 0) {
    //         return 0;
    //     }
    //     Arrays.sort(nums);
    //     int ls = 1;
    //     int cs = 1;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i] != nums[i-1]){
    //             if(nums[i] == nums[i-1]+1){
    //                 cs = cs+1;
    //             }else{
    //                 ls = Math.max(ls,cs);
    //                 cs = 1;
    //             }
    //         }
    //     }
    //     return Math.max(ls,cs);
    // }
}