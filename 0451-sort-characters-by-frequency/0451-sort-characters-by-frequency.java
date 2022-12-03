public class Solution {
    
    public static String frequencySort(String s) {
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) map.put(c, new int[]{1, i});
            else {
                int[] freqAndSeq = map.get(c);
                freqAndSeq[0]++;
                map.put(c, freqAndSeq);
            }
        }

        PriorityQueue<Map.Entry<Character, int[]>> pq = new PriorityQueue<>((a, b) ->
                a.getValue()[0] == b.getValue()[0] ? a.getValue()[1] - b.getValue()[1] : b.getValue()[0] - a.getValue()[0]);

        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, int[]> e = pq.poll();
            for (int i = 0; i < e.getValue()[0]; i++)
                sb.append(e.getKey());
        }
        return sb.toString();
    }
    
//     public String frequencySort(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         for (char c : s.toCharArray()) 
//             map.put(c, map.getOrDefault(c, 0) + 1);
						
//         List<Character> [] bucket = new List[s.length() + 1];
//         for (char key : map.keySet()) {
//             int frequency = map.get(key);
//             if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
//             bucket[frequency].add(key);
//         }
				
//         StringBuilder sb = new StringBuilder();
//         for (int pos = bucket.length - 1; pos >= 0; pos--)
//             if (bucket[pos] != null)
//                 for (char c : bucket[pos])
//                     for (int i = 0; i < pos; i++)
//                         sb.append(c);

//         return sb.toString();
//     }
}