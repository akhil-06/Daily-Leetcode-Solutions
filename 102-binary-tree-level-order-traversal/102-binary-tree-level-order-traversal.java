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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        compute(ans,root,0);
        return ans;
    }
    
    public void compute(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(curr.val);
        
        compute(ans,curr.left,level+1);
        compute(ans,curr.right,level+1);
    }
    
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> res = new ArrayList<List<Integer>>();
//         levelHelper(res, root, 0);
//         return res;
//     }
    
//     public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
//         if (root == null) return;
//         if (height >= res.size()) {
//             res.add(new LinkedList<Integer>());
//         }
//         res.get(height).add(root.val);
//         levelHelper(res, root.left, height+1);
//         levelHelper(res, root.right, height+1);
//     }
    
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         Queue<TreeNode> queue = new LinkedList<TreeNode>();
//         List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        
//         if(root == null) return wrapList;
        
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             int levelNum = queue.size();
//             List<Integer> subList = new LinkedList<Integer>();
//             for(int i=0; i<levelNum; i++) {
//                 if(queue.peek().left != null) queue.offer(queue.peek().left);
//                 if(queue.peek().right != null) queue.offer(queue.peek().right);
//                 subList.add(queue.poll().val);
//             }
//             wrapList.add(subList);
//         }
//         return wrapList;
//     }
}