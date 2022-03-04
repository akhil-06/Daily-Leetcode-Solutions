/*
        1
       1 1
      1 2 1
     1 2 2 1 
     
                       n
                (n-1)/2 (n-1)/2  
    ((n-1)/2-1)/2 ((n-1)/2-1)/2 ((n-1)/2-1)/2
*/
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
       if(poured == 0) return 0;
        
        List<Double> res = new ArrayList<>();
        res.add((double) poured); // start with n poured
        
        for(int i = 0; i < query_row; i++) {
            List<Double> tmp = new ArrayList<>(); // tmp for next row process
            
            // add first smallest
            tmp.add(Math.max((res.get(0)-1)/2, 0.0));       
            // add middle parts - up to prev row's size, we add last one afterwards
            for(int j = 1; j < res.size(); j++) {
                tmp.add(Math.max((res.get(j-1)-1)/2, 0.0) + Math.max((res.get(j)-1)/2, 0.0));
            }
            // add last smallest - same as first element stored in tmp
            tmp.add(Math.max(tmp.get(0), 0.0));
            
            // now set the tmp arraylist to res for next row process
            res = new ArrayList<>(tmp);
        }
        
        return Math.min(res.get(query_glass), 1);
    }
}