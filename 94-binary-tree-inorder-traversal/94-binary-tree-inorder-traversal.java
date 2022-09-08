/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    // method 1: recursion

    helper(root, res);
    return res;
  }
    //helper function for method 1
    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
           }
}
    
    // public List<Integer> inorderTraversal(TreeNode root) {
    // List<Integer> res = new ArrayList<>();
    // // method 2: iteration
    // Stack<TreeNode> stack = new Stack<>();
    // TreeNode cur = root;
    // while (cur != null || !stack.isEmpty()) {
    //     while (cur != null) {
    //         stack.push(cur);
    //         cur = cur.left;
    //     }
    //     cur = stack.pop();
    //     res.add(cur.val);
    //     cur = cur.right;
    // }
    // return res;        

   }
}
//In inorder -> left is print 1st an dthen we print the rot an dthen we print the right part

