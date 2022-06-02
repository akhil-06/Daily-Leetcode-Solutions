class Solution {
    
    public boolean isPalindrome(int num){
   if(num < 0 || num >= Integer.MAX_VALUE) return  false; 
   int reversed = 0, remainder, original = num;
   while(num != 0) {
        remainder = num % 10; // reversed integer is stored in variable
        reversed = reversed * 10 + remainder; //multiply reversed by 10 then add the remainder so it gets stored at next decimal place.
        num  /= 10;  //the last digit is removed from num after division by 10.
    }
    // palindrome if original and reversed are equal
    return original == reversed;
}
    
    
//      public boolean isPalindrome(int x) {
//         if(x < 0) {
//             return false;
//         }
        
//         int rev = reverse(x);
//         return rev == x;
//          // if(x == rev){
//          //     return true;
//          // }else{
//          //     return false;
//          // }
//     }
    
//     public int reverse(int n) {
//         int res = 0;
//         while(n != 0) {
//             res = res*10 + n%10;
//             n /= 10;
//         }
//         return res;
//     }
    
//     public boolean isPalindrome(int x) {
//         String s = String.valueOf(x);

//         int num = s.length();
        
//         int count = s.length()/2;
        
//         int i=0;
//         while(i<count){
//             if(s.charAt(i)!=s.charAt(num-1-i)) {
//                return false;
//             }
//             i++;
//         }
//         return true;
    
//     }
}