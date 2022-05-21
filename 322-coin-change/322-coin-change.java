class Solution {
    
    //DP solution TC is O(arraySize.amount)
     public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        
        int dp[][] = new int[n+1][amount+1];
        
        for(int i=0;i<=n;++i)
        {
            for(int j=0;j<=amount;++j)
            {
                if(j==0)
                    dp[i][j] = 0;
                else if(i==0)
                    dp[i][j] = 100000;  // we have taken infinite as this number
                else if(coins[i-1]>j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.min(1 + dp[i][j-coins[i-1]], dp[i-1][j]);
            }
        }
        return dp[n][amount]>1e4 ? -1:dp[n][amount]; //1e4 means 10 raise to the power 4
    }
    
    
    //Recursiive solution
//    public int coinChange(int[] coins, int amount) {
//         int res = countCoinRecur(coins, amount, coins.length-1);
//         return (res == Integer.MAX_VALUE) ? -1 : res;        
//     }
    
//     private int countCoinRecur(int[] coins, int amount, int idx) {
        
//         if (amount == 0) return 0;
//         if (amount < 0 && idx >= 0) return Integer.MAX_VALUE;
//         if (amount > 0 && idx < 0) return Integer.MAX_VALUE;
        
//         if (coins[idx] > amount) return countCoinRecur(coins, amount, idx-1);
        
//         int incl = countCoinRecur(coins, amount-coins[idx], idx);
//         int excl = countCoinRecur(coins, amount, idx-1);
        
//         return Math.min(excl, (incl != Integer.MAX_VALUE) ? incl + 1 : Integer.MAX_VALUE);
//     }
}