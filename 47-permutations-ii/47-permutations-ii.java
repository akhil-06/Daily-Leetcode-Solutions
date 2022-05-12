class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visit = new boolean[nums.length];
        helper(new LinkedList<Integer>(), visit, nums);
        return ans;
    }
    
    private void helper(LinkedList<Integer> list, boolean[] visit, int[] nums) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (visit[i] || (i > 0 && visit[i - 1] == false && nums[i - 1] == nums[i])) {
                continue;
            } else {
                // update visit
                visit[i] = true;
                // add new number
                list.add(nums[i]);
                // backtrack (recursive call)
                helper(list, visit, nums);
                // remove new number
                list.removeLast();
                // update visit
                visit[i] = false;
            }
        }
    }
}