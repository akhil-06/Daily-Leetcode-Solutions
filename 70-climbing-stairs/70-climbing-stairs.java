class Solution {
    
    /*
 * Ideas:
 * Use Dynamic Programming,
 * for each step, the stair could ether combine with the previous one or as a single step.
 * Ways to climb to ith stair is W(i) = W(i-1) + W(i-2)
 * where W(i-1) is when the ith stair is as a single step
 * and W(i-2) is when the ith stair is paired with the previous one.
 */
    //Dynamic Programming code
public int climbStairs(int n) {
        int[] tmp = new int[n];
        if (n < 2){
            return 1;
        }
        tmp[0] = 1;
        tmp[1] = 2;
        for (int i = 2; i < n; i++){
            tmp[i] = tmp[i-1] + tmp[i-2];
        }
        return tmp[n-1];
    }
    
    //2-3 lin of code
//     public int climbStairs(int n) {
//     int a = 1, b = 1;
//     while (n-- > 0)
//         a = (b += a) - a;
//     return a;
// }
    
    
    //Fibonacci Number
    // public int climbStairs(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     int first = 1;
    //     int second = 2;
    //     for (int i = 3; i <= n; i++) {
    //         int third = first + second;
    //         first = second;
    //         second = third;
    //     }
    //     return second;
    // }
    
    
    //Brute force approach 
    // public int climbStairs(int n) {
    //     return climb_Stairs(0, n);
    // }
    // public int climb_Stairs(int i, int n) {
    //     if (i > n) {
    //         return 0;
    //     }
    //     if (i == n) {
    //         return 1;
    //     }
    //     return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    // }
}