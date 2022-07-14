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
    public TreeNode TreeFormInPre(int []in, int []pre, int inS, int inE, int preS, int preE){
		if(inS > inE) {
			return null;
		}
		//rootdata lelia
		int rootData = pre[preS];
		//created root of tree by rootdata
		TreeNode root = new TreeNode(rootData);
		int inIndex = -1;
		//traverse the in array for calculating the all values
		for(int i= inS; i<=inE;i++) {
			if(in[i] == rootData) {
				inIndex = i;
				break;
			}
		}

		//this situation will not come, but we write to on safe side
		if(inIndex  == -1) {
			return null;
		}

		int inLeftS = inS;
		int inLeftE = inIndex - 1;
		int inRightS = inIndex + 1;
		int inRightE = inE;
		int preLeftS = preS + 1;
		//we done because the length of both will same
		//preLeftE - preLeftS = inLeftE - inLeftS -> both will have same elements 
		//by this equation we can write this
		int preLeftE = inLeftE - inLeftS + preLeftS;
		int preRightS = preLeftE + 1;
		int preRightE = preE;

		root.left = TreeFormInPre(in, pre, inLeftS, inLeftE, preLeftS, preLeftE);
		root.right = TreeFormInPre(in, pre, inRightS, inRightE, preRightS, preRightE);

		return root;
	}

    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return TreeFormInPre(inorder, preorder , 0, inorder.length -1, 0, preorder.length -1);
    }
}