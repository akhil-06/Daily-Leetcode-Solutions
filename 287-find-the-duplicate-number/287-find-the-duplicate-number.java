class Solution {
    public int findDuplicate(int[] nums) {
        for (int n : nums) {
            if (nums[Math.abs(n)] < 0) {
                return Math.abs(n);
            } else {
                nums[Math.abs(n)] *= -1;
            }
        }
        return -1;
    }
}


// TC is O(N) and SC is O(1)
// Since array length is n+1, the values in nums are essentially valid indices of itself.
// for each value n of nums, go to nums[n] to make that value negative.
// if the value at nums[n] is already negative, it means that n has already existed.