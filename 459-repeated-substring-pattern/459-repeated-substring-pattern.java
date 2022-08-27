class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        
        for (int i = n / 2; i > 0; i--) {
            if (n % i == 0) {
                int left = 0;
                int right = i;
                
                while (right < n && str.charAt(left++) == str.charAt(right)) right++;
                
                if (right == n) {
                    return true;
                }                
            }
        }
        
        return false;
    }
}