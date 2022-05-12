// class Solution {
//     List<List<Integer>> ans = new ArrayList<>();
    
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         Arrays.sort(nums);
//         boolean[] visit = new boolean[nums.length];
//         helper(new LinkedList<Integer>(), visit, nums);
//         return ans;
//     }
    
//     private void helper(LinkedList<Integer> list, boolean[] visit, int[] nums) {
//         if (list.size() == nums.length) {
//             ans.add(new ArrayList<>(list));
//             return;
//         }
        
//         for (int i = 0; i < nums.length; ++i) {
//             if (visit[i] || (i > 0 && visit[i - 1] == false && nums[i - 1] == nums[i])) {
//                 continue;
//             } else {
//                 // update visit
//                 visit[i] = true;
//                 // add new number
//                 list.add(nums[i]);
//                 // backtrack (recursive call)
//                 helper(list, visit, nums);
//                 // remove new number
//                 list.removeLast();
//                 // update visit
//                 visit[i] = false;
//             }
//         }
//     }
// }

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums==null || nums.length==0) { return ans; }
        permute(ans, nums, 0);
        return ans;
    }
    
    private void permute(List<List<Integer>> ans, int[] nums, int index) {
        if (index == nums.length) { 
            List<Integer> temp = new ArrayList<>();
            for (int num: nums) { temp.add(num); }
            ans.add(temp);
            return;
        }
        Set<Integer> appeared = new HashSet<>();
        for (int i=index; i<nums.length; ++i) {
            if (appeared.add(nums[i])) {
                swap(nums, index, i);
                permute(ans, nums, index+1);
                swap(nums, index, i);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int save = nums[i];
        nums[i] = nums[j];
        nums[j] = save;
    }
}