class Solution {
    public boolean find132pattern(int[] nums) {
        Stack <Integer> stack = new Stack ();
        int second = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums [i] < second)
                return true;
            while (!stack.isEmpty() && nums [i] > stack.peek ())
                second = stack.pop ();
            stack.push (nums [i]);
        }
        return false;
        
    //     for (int i = 0; i < nums.length; i++) {
    //     for (int j = i + 1; j < nums.length; j++) {
    //         for (int k = j + 1; k < nums.length; k++) {
    //             if (nums[i] < nums[k] && nums[k] < nums[j]) return true;
    //         }
    //     }
    // }
    // return false;
    }
}