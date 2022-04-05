class Solution {
    //O(N) solution two poointer approach 
    public int maxArea(int[] height) {
        if(height.length == 0 || height.length == 1) return 0;
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l<r){
            int lh = height[l];
            int rh = height[r];
            int minHeight = Math.min(lh,rh);
            int len = r-l;
            int area = minHeight * len;
            max = Math.max(max,area);
            if(lh<rh) l++;
            else r--;
        }
        return max;
    }
}