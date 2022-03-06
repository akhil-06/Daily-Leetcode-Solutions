// For arranging all pickup we will have n! options as relative arrangement among them does not matter
// For arranging all delivery we will have 1*3*5*3...*(2n-1) options as D[i] can come at any place but only after P[i]
// TC : O(n)
//SC : O(n)
class Solution {
    public int countOrders(int n) {
        long[] dp = new long[501];
        int mod = (int) Math.pow(10,9) + 7;
        dp[1]=1L;
        dp[2]=6L;
        for (int i=3;i<=n;i++) {
            int odddNo = 2 * i -1;
            int permutations = odddNo * (odddNo+1)/2;
            dp[i] = (dp[i-1]*(permutations))%mod;
        }
        return (int) dp[n];
    }
}