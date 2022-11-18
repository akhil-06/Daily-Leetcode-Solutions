class Solution {
    public boolean isUgly(int num) {
        
        if (num <= 0) {return false;}
    if (num == 1) {return true;}
    if (num % 2 == 0) {
        return isUgly(num/2);
    }
    if (num % 3 == 0) {
        return isUgly(num/3);
    }
    if (num % 5 == 0) {
        return isUgly(num/5);
    }
    return false;
        
      // the idea is to keep on dividing by 2,3 and 5
        // if the remaining number is 1 then return true
        // otherwise return false
        // if(n<1)
        //     return false;
        // if(n == 1)
        //     return true;
        // while(n%2==0)
        //     n/=2;
        // while(n%3==0)
        //     n/=3;
        // while(n%5==0)
        //     n/=5;
        // if(n == 1)
        //     return true;
        // else
        //     return false;
    }
}