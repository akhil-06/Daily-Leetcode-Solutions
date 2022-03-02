class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;
        if(s.length() == 0) return true;
        //Simple approach just finding if it the char matches, move the s string and if
        //our string is at last return true;
        int i=0;
         int j=0;
        
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s.length()) return true;
        return false;
    }
}