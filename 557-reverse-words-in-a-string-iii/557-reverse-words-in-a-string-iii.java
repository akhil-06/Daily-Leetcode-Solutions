class Solution {
    public void reverse(char[] c, int x, int y){
      
        while(x<=y){
            char t = c[x];
            c[x] = c[y];
            c[y] = t;
            x++;
            y--;
        }
    }
    public String reverseWords(String s) {
        char[] s1 = s.toCharArray();
    int i = 0;
    for(int j = 0; j < s1.length; j++)
    {
        if(s1[j] == ' ')
        {
            reverse(s1, i, j - 1);
            i = j + 1;
        }
    }
    reverse(s1, i, s1.length - 1);
    return new String(s1);
    }
}