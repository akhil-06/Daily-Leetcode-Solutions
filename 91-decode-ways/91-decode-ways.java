class Solution {
    
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
               dp[i] += dp[i-1];  
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
    
    
//     memoization code
//     public int numDecodings(String s) {
//         int []arr = new int[s.length()];
//         int ans = rec(s,0,arr);
//         return ans;
//     }
    
//     public int rec(String s, int i, int[]arr){
//         if(i == s.length()) return 1;
//         if(s.charAt(i) == '0') return 0;
//         if(i == s.length() - 1) return 1;
//         if(arr[i] > 0) return arr[i];
        
//         int way1 = rec(s,i+1,arr);//when we take 1 char
//         int way2 = 0;
//         if(Integer.parseInt(s.substring(i,i+2)) <= 26) way2 = rec(s,i+2,arr);
        
//         arr[i] = way1+way2;
//         return arr[i];
//     }
    
    
    //recursion
//     public int numDecodings(String s) {
//         int ans = rec(s,0);
//         return ans;
//     }
    
//     public int rec(String s, int i){
//         if(i == s.length()) return 1;
//         if(s.charAt(i) == '0') return 0;
//         if(i == s.length() - 1) return 1;
        
//         int way1 = rec(s,i+1);//when we take 1 char
//         int way2 = 0;
//         if(Integer.parseInt(s.substring(i,i+2)) <= 26) way2 = rec(s,i+2);
        
//         return way1 + way2;
//     }
}