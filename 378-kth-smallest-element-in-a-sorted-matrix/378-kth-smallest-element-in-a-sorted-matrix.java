    class Solution {

    //    Main loop is binary search of max - min.
    // Swap from left-bottom to right-top can get count <= mid in O(n) time instead of O(nlogn), total complexity will be O(nlogm) while m = max - min.

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int lo = matrix[0][0]; 
        int hi = matrix[n - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = getLessEqual(matrix, mid);
            if (count < k){
                lo = mid + 1;
            }
            else{
            hi = mid - 1;
            }
        }
        return lo;
    }

    private int getLessEqual(int[][] matrix, int val) {
        int res =0;
        int n = matrix.length;
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > val){
                i--;
            }else {
                res += i + 1;
                j++;
            }
        }
        return res;
    }




    //   public int kthSmallest(int[][] matrix, int k) {
    //         int n = matrix.length;
    // PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) -> (n2 - n1));
    // for (int i = 0; i < n; ++i) {
    //   for (int j = 0; j < n; ++j) {
    //     pq.add(matrix[i][j]);
    //     if (pq.size() > k) {
    //       pq.poll();
    //     }
    //   }
    // }
    // return pq.poll();
    //   }
    }
