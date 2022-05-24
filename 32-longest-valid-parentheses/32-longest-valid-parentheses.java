public class Solution {
    public int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }
}

// public class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 stack.push('(');
//             } else if (!stack.empty() && stack.peek() == '(') {
//                 stack.pop();
//             } else {
//                 return false;
//             }
//         }
//         return stack.empty();
//     }
//     public int longestValidParentheses(String s) {
//         int maxlen = 0;
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 2; j <= s.length(); j+=2) {
//                 if (isValid(s.substring(i, j))) {
//                     maxlen = Math.max(maxlen, j - i);
//                 }
//             }
//         }
//         return maxlen;
//     }
// }