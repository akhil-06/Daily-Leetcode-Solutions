class Solution {
    //si mple recursive approach
//     public int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1) return 1;
        
//         return fib(n-1) + fib(n-2);
//     }
    
    
    //via DP
//     public int fib(int N) {
//         if (N <= 1) {
//             return N;
//         }
//         return memoize(N);
//     }

//     public int memoize(int N) {
//       int[] cache = new int[N + 1];
//       cache[1] = 1;

//       for (int i = 2; i <= N; i++) {
//           cache[i] = cache[i-1] + cache[i-2];
//       }
//       return cache[N];
//     }
    
    //iterative and top-down approach 
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        if (N == 2) {
            return 1;
        }

        int current = 0;
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 3; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}