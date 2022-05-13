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
//     }
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

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return root;
        
        Queue<Node> q = new LinkedList();
        q.offer(root);
        q.offer(null);
        //System.out.println(Arrays.toString(q));
        while(q.size()>1){
            Node n = q.poll();
            if(n == null)
                q.offer(n);
            else{
                //System.out.println(n.val+"  "+q.peek()+"    "+n.left.val+"  "+n.right.val);
                n.next = q.peek();
                if(n.left != null)
                    q.offer(n.left);
                if(n.right != null)
                    q.offer(n.right); 
            } 
            //print(q);
        }
        return root;
    }
    
    private void print(Queue<Node> q){
        List<Node> arr = new ArrayList(q);
        for(Node n: arr){
            if(n==null){
                System.out.print("NULL"+"    ");
                continue;
            }
                
            System.out.print(n.val+"    ");
        }
    }
}
