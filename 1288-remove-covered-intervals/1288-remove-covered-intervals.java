class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        //if length is 0 then in that case return 0
        if(intervals.length == 0 || intervals == null) 
            return 0;
        int count = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] curr = {-1,-1};    //for storing the values of interval 0 and 1
        for(int[] interval:intervals){
            if(curr[0] < interval[0] && curr[1] < interval[1]){
                curr[0] = interval[0];
                count++;
            }
            curr[1] = Math.max(curr[1],interval[1]);
        }
        return count;
    }
}