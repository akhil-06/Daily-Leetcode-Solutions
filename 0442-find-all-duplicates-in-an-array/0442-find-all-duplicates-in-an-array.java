//refer -  https://www.youtube.com/watch?v=8ci8WfQ6cns

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       //in this we have given a special property elements are from 1 to n and no 
        //element is more than twice 
        //we treat numbers as indexes, thats why this question becomes different
        //numbers are from 1 to n and indexes are 0 - n-1
    
        List<Integer> result = new ArrayList();
        //we traverse on the array, n is actual number
        for(int n: nums){
            //we have made some values -ve and we go to that index, then we dont want that 
            //index will have -ve value
            n = Math.abs(n);
            //here we checking indexes
            //if index is greater than 0 means we are coming here 1st time
            //so we add -ve to that index
            if(nums[n-1] > 0) nums[n-1] *= -1;
            //else this is -ve, we come back 2nd time so add that element
            else result.add(n);
        }
        
        //return result
        return result;
    }
}