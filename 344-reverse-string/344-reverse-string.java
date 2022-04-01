class Solution {
    public void reverseString(char[] c) {


        //in this case string is given make that to char array and then appl this method 
        int i =0;
        int j = c.length-1;
        while(i <= j){
             char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }
    }
}

//if string is given then we can do this 
//method 1: use StringBuilder
    // public String reverseString(String s) {
    //     StringBuilder sb = new StringBuilder(s);
    //     return sb.reverse().toString();
    // }
