// The main idea behind this question is to:-
// store the pair of character and the current count in the stack
// when the current character is same as the top character and the count is k then pop last k element.
class Solution {
    public String removeDuplicates(String s, int k) {
		// stack of pairs
		// charcter and the count
        Stack<Pair<Character, Integer>> st = new Stack<>();
        
		// We will loop through each character
        for (char c: s.toCharArray()) {
			// if the stack is empty mean, there is no element
			// so we can put the character with count as 1
            if (st.empty()) {
                st.push(new Pair(c, 1));
            } else {
				// we will get the top element
				// if it is same then check for k count and delete
				// or push the character with incremented count
				// if the char is not the same then count will again start from 1
                Pair<Character, Integer> p = st.peek();
                if (p.getKey() == c) {
                    if (p.getValue() == k-1) {
                        for (int i = 0; i < k-1; i++) {
                            st.pop();
                        }
                    } else {
                        st.push(new Pair(c, p.getValue() + 1));
                    }
                } else {
                    st.push(new Pair(c, 1));
                }
            }
        }
        
		// Now we can build the strin from the stack
        StringBuilder sb = new StringBuilder();
        
        while(!st.empty()) {
            Pair<Character, Integer> p = st.pop();
            sb.append(p.getKey());
        }
        
        return sb.reverse().toString();
    }
}