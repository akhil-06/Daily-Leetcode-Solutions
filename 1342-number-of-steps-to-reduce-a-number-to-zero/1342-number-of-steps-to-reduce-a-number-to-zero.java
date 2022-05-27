class Solution {
    // public int numberOfSteps (int num) {
    //     if(num == 0) {
    //         return 0;
    //     }
    //     else if(num % 2 == 0) {
    //         return (numberOfSteps(num/2) + 1);
    //     }
    //     else if(num % 2 == 1) {
    //         return (numberOfSteps(num-1) + 1);
    //     }
    //     return 0;
    // }
    
    public int numberOfSteps(int num) {
        return num == 0 ? 0 : Integer.bitCount(num) + (31 - Integer.numberOfLeadingZeros(num));
    }
}