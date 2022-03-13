class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            }
            else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }
            else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }else{
                return false;
            }
        }
        return st.isEmpty();
        
	// Stack<Character> stack = new Stack<Character>();
	// for (char c : s.toCharArray()) {
	// 	if (c == '(')
	// 		stack.push(')');
	// 	else if (c == '{')
	// 		stack.push('}');
	// 	else if (c == '[')
	// 		stack.push(']');
	// 	else if (stack.isEmpty() || stack.pop() != c)
	// 		return false;
	// }
	// return stack.isEmpty();
    }
}

 