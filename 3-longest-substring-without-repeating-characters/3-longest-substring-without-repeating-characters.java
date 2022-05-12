class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans,set.size());
            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}