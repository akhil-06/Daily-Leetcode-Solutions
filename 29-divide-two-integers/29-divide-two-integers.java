class Solution {
    
    // TC is log of n2 and SC is 1
    public int divide(int dividend, int divisor) {
        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;//edge case 
        
        boolean sign = (dividend>=0) == (divisor >=0) ? true : false;
        //taking absloute value of both 
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result=0;
        while(dividend - divisor >= 0 ){
            int count=0;
            while(dividend  - (divisor << 1 << count) >= 0 ){ //we are doubling the value so means we are shifting value by one but how many times we shift count times 
                count++;
            }
            //we dont directly add count we add 1<<count
            result += 1 << count;
            //we substarct <<count from divisor
            dividend -= divisor << count ;
        }
    //check for the sign part    
        return sign?result: -result ;
    }
}