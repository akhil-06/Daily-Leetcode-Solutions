class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(n1,n2)->{
            if(n2[0] == n1[0]) return n1[1]-n2[1];
            return n2[0]-n1[0];
        });
        int m=0,ans=0;
        for(int[] prop: properties){
            if(prop[1]<m) ans++;
            m=Math.max(m,prop[1]);
        }
        return ans;
    }
}