class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int start=0,len=0;
        
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            
            if(map.containsKey(c)){
                if(start<=map.get(c)){
                    start=map.get(c)+1;
                }
            }
            
            len=Math.max(len,end-start+1);
            map.put(c,end);
        }
        return len;
    }
    
    //  public int lengthOfLongestSubstring(String s) {
    //     int[] mOccur = new int[256];
    //     int maxL = 0;
    //     for(int i = 0, j = 0; i < s.length(); ++i){
    //         char ch = s.charAt(i);
    //         ++mOccur[ch];
    //         while(mOccur[ch] > 1){
    //             --mOccur[s.charAt(j++)];
    //         }
    //         maxL = Math.max(maxL, i - j + 1);
    //     }
    //     return maxL;
    // }
    
    // public int lengthOfLongestSubstring(String s) {
    //      if (s.length()==0) return 0;
    //     HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    //     int max=0;
    //     for (int i=0, j=0; i<s.length(); ++i){
    //         if (map.containsKey(s.charAt(i))){
    //             j = Math.max(j,map.get(s.charAt(i))+1);
    //         }
    //         map.put(s.charAt(i),i);
    //         max = Math.max(max,i-j+1);
    //     }
    //     return max;   
    // }
}