class Solution {
    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> result =  new ArrayList<>();
        if(numRows==0) return result;

        
        for(int i=0;i<numRows;i++){
           List<Integer> level = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    level.add(1);
                }else{
                    List<Integer> cur = result.get(i-1);
                    level.add(cur.get(j-1)+cur.get(j));
                }
            }
            result.add(level);

        }
     
        return result;
    }
}

// Just use the conditions correctly
// 1st we check the base case
// Then a loop for no.Ofrows
// and then a loop for where we want to go
// then check the condition for putting 0 in start and end of each row
// We take the previous kevel list in cur, so that we can do operations
// Then find sum and Add that in mini list and then add in final ans