class Solution {
     public int[] countBits(int num) {
        int ans[] = new int[num+1];
         
         for(int i=0;i<=num;i++){
             ans[i] = rec(i,ans);
         }
         return ans;
     }
    
    public int rec(int num,int[] ans){
        if(num == 0) return 0;
        if(num == 1) return 1;
        if(ans[num] > 0) return ans[num];
        if(num%2 == 0) return ans[num] = rec(num/2,ans);
        else return ans[num] = 1+rec(num/2,ans);
    }
    
    
//     public int[] countBits(int num) {
        
//          int arr[] = new int[num+1];
//         arr[0] = 0;
//          for (int i = 1; i <= num; i++) {
//           arr[i] = arr[i/2] + i%2;   
//          }
        
//         return arr;
        
//          int arr[] = new int[num+1];
//         arr[0] = 0;
//         for (int i = 1; i <= num; i++) {
//             arr[i] = arr[i & i-1] + 1;
//         }
//         return arr;
        
    //      int[] ans = new int[n + 1];
    // for (int i=1; i<=n; i++){
    //     ans[i] = ans[i >> 1] + (i & 1);
    // }
    // return ans;
    // }
}