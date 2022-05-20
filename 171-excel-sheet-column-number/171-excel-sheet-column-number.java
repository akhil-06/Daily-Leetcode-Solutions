class Solution {
    
    //same code bus writing of code is different 
    
  //   public int titleToNumber(String s) {
  //   int result = 0;
  //   for(int i = 0 ; i < s.length(); i++) {
  //     result = result * 26 + (s.charAt(i) - 'A' + 1);
  //   }
  //   return result;
  // }
    
    public int titleToNumber(String s) {
        int ans  = 0;
        int p  = 0;
        for(int i = s.length() -1; i>=0; i--){
           char c = s.charAt(i);
           int val = (int)c - 65 + 1;
           ans += val*Math.pow(26, p);
            p++;
        }
        
        return ans;
    }
    
    // public int titleToNumber(String columnTitle) {
    //       if (columnTitle == null) return -1;
    //     int sum = 0;
    //     // for each loop so we don't need to mess with index values.
    //     for (char c : columnTitle.toUpperCase().toCharArray()) {
    //         sum *= 26;
    //         sum += c - 'A' + 1;
    //     }
    //     return sum;
    // }
}