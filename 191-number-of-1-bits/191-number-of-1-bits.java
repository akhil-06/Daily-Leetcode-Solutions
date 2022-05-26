public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        for(int i=0;i<32;i++){
            if(((n>>>i)&1)!=0){
                count++;
            }
        }
        return count;
        
        
    //          int count = 0;
    //      while (n != 0) {
    //          int rsbm = n & -n;
    //          n = n- rsbm;
    //     count++;
    //     // n &= (n - 1);
    // }
    // return count;
        
        
    // //     int bits = 0;
    // // int mask = 1;
    // // for (int i = 0; i < 32; i++) {
    // //     if ((n & mask) != 0) {
    // //         bits++;
    // //     }
    // //     mask <<= 1;
    // // }
    // return bits;
   
    }
}