class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String p = normalize(pattern);
        List<String> ans = new ArrayList<>();
        for(String word:words){
            if(p.equals(normalize(word))) ans.add(word);
        }
        return ans;
    }
    
    private String normalize(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        int len = str.length();
        
        String ans = " ";
        
        for(int i=0;i<len;i++){
            hm.putIfAbsent(str.charAt(i),hm.size());
            ans+= hm.get(str.charAt(i));
        }
        return ans;
    }
}