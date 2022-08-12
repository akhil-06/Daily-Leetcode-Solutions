/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
          int pval = p.val;
          int qval = q.val;
          
          while(root != null){
              if(pval > root.val && qval > root.val){
                  root = root.right;
              }else if(pval < root.val && qval < root.val){
                  root = root.left;
              }
              else{
                  return root;
              }
          }
          return null;
    
    //iterative method
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null || root == p || root == q){
//             return root;
//         }
        
//         TreeNode left = lowestCommonAncestor(root.left , p , q);
//         TreeNode right = lowestCommonAncestor(root.right , p , q);
        
//         if(left != null & right != null){
//             return root;
//         }
        
//         if(left == null){
//             return right;
//         }else{
//             return left;
//         }
    }
}