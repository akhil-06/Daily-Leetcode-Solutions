/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

// class Solution {
//     public Node connect(Node root) {
//         if(root == null || root.left == null || root.right == null) return root;
//         root.left.next = root.right;
//         if(root.next!=null){
//             root.right.next = root.next.left;
//         }
//         connect(root.left);
//         connect(root.right);
//         return root;
   
//     }
// }
class Solution {
    public Node connect(Node root) {
        ArrayList<Node> temp=new ArrayList<>();
        solve(root,temp,0);
        return root;
    }
    public void solve(Node root,ArrayList<Node> temp,int level){
        if(root==null)return;
        if(temp.size()==level)temp.add(root);
        else{
            temp.get(level).next=root;
            temp.set(level,root);
        }
        solve(root.left,temp,level+1);
        solve(root.right,temp,level+1);
    }
}

