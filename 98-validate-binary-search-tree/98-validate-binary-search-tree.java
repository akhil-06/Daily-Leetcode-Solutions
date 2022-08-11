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
    
	List<Integer> list = new ArrayList<Integer>();

	public boolean isValidBST(TreeNode root) {
		inOrder(root);
		return isSortedArray();
	}

	private boolean isSortedArray() {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) >= list.get(i + 1)) {
				return false;
			}
		}
        
		return true;
	}

	private void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		list.add(root.val);
		inOrder(root.right);
	}

    
//     public boolean isValidBST(TreeNode root) {        
//         return helper(root, null, null);   
//     }
    
//     private boolean helper(TreeNode root, TreeNode min, TreeNode max) {
//         if (root == null) 
//             return true;
//         if ((min != null && root.val <= min.val) || (max != null && root.val >= max.val))
//             return false;

//         return helper(root.left, min, root) && helper(root.right, root, max);
//     }
    
//     public boolean isValidBST(TreeNode root) {
//        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
//     }
//     public boolean valid(TreeNode node, long start, long end){
//         if(node == null){
//             return true;
//         }
        
//         if(start<node.val && node.val<end){
//             return valid(node.left,start,node.val) && valid(node.right,node.val,end);
//         }
//         return false;
//     }
}


