// For arranging all pickup we will have n! options as relative arrangement among them does not matter
// For arranging all delivery we will have 1*3*5*3...*(2n-1) options as D[i] can come at any place but only after P[i]
// TC : O(n)
//SC : O(n)
class Solution {
    public int countOrders(int n) {
        
        long ans = 1;
        int MOD = 1_000_000_007;

        for (int i = 1; i <= n; ++i) {
            // Ways to arrange all pickups, 1*2*3*4*5*...*n
            ans = ans * i;
            // Ways to arrange all deliveries, 1*3*5*...*(2n-1)
            ans = ans * (2 * i - 1);
            ans %= MOD;
        }
        
        return (int)ans;
        
        // long[] dp = new long[501];
        // int mod = (int) Math.pow(10,9) + 7;
        // dp[1]=1L;
        // dp[2]=6L;
        // for (int i=3;i<=n;i++) {
        //     int odddNo = 2 * i -1;
        //     int permutations = odddNo * (odddNo+1)/2;
        //     dp[i] = (dp[i-1]*(permutations))%mod;
        // }
        // return (int) dp[n];
    }
}