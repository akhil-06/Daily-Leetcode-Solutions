class Solution {
    
    public static String longestPalindrome(String s) {
        int n = s.length();
        String res = null;
        int palindromeStartsAt = 0, maxLen = 0;

        boolean[][] dp = new boolean[n][n];
        // dp[i][j] indicates whether substring s starting at index i and ending at j is palindrome
        
        for(int i = n-1; i >= 0; i--) { // keep increasing the possible palindrome string
            for(int j = i; j < n; j++) { // find the max palindrome within this window of (i,j)
                
                //check if substring between (i,j) is palindrome
                dp[i][j] = (s.charAt(i) == s.charAt(j)) // chars at i and j should match
                           && 
                           ( j-i < 3  // if window is less than or equal to 3, just end chars should match
                             || dp[i+1][j-1]  ); // if window is > 3, substring (i+1, j-1) should be palindrome too
                
                //update max palindrome string
                if(dp[i][j] && (j-i+1 > maxLen)) {
                    palindromeStartsAt = i;
                    maxLen = j-i+1;
                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt+maxLen);
    }
    
    
    
    
    
    
//    public String longestPalindrome(String s) {

//     String ans="";
//       for(int i=0;i<s.length();i++)
//       {
//           for(int j=s.length()-1;j>i;j--)
//           {
//               String temp=s.substring(i,j+1);
//               if(temp.length()>ans.length() && palindrome(temp))
//               {
//                   ans=temp;
//                   break;
//               }
//           }
//       }
//     return (ans.length()>0)?ans:s.charAt(0)+"";
// }

// boolean palindrome(String s)
// {
//     int i=0;
//     int j=s.length()-1;
//     while(j>i)
//     {
//         if(s.charAt(i)==s.charAt(j))
//         {
//             i++;
//             j--;
//         }
//         else
//             return false;
//     }
//     return true;
// }
}