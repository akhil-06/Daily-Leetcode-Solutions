class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = k % (m * n);
        int start = m * n - k;  // new (0,0) element in old grid 
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m * n;) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int pos = (i + start) % (m * n);
                line.add(grid[pos / n][pos % n]);
                i++;
            }
            res.add(line);
        }
        return res;
    }
}