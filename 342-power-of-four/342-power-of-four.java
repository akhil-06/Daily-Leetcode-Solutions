class Solution {
    public boolean isPowerOfFour(int n) {
        
        int count = 0;
        for(int i=0;i<32;i++){
            if(((n>>>i)&1)!=0){
                count++;
                if(i%2==1) return false;
            }
        }
        if(count == 1 && n>0) return true;
        else return false;

        // return (Math.log(n) / Math.log(4)) % 1 == 0;
        
        //3rd way
         // return n > 0 && (n&(n-1)) == 0 && (n & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position 
        
        //2nd way
        //  return (n > 0 && Math.pow(
        // 4, (int)((Math.log(n) / Math.log(2))
        //          /
        //          (Math.log(4) / Math.log(2)))) == n);
        
        
        
        //one method
        //  if(n == 0)
        // return false;
        // while(n != 1)
        // {
        //     if(n % 4 != 0)
        //     return false;
        //     n = n / 4;    
        // }
        // return true;
    }
}