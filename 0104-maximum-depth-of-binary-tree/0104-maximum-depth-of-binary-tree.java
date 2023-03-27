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
 /*
     class Pair{
        TreeNode root;
        int depth;
        Pair(TreeNode _root,int _depth){
            root = _root;
            depth = _depth;
        }
    }
    */
    /*Iterative DFS
    public int maxDepth(TreeNode root) {
       if(root == null) return 0;
       Stack<Pair> st = new Stack<>();
       st.add(new Pair(root,1));
       int max = 0;
       while(!st.isEmpty()){
           Pair node = st.pop();
           if(node.root!=null){
               st.add(new Pair(node.root.left,node.depth+1));
               st.add(new Pair(node.root.right,node.depth+1));
               max = Math.max(max,node.depth);
           }
       }
       return max;
    }
    */
    
    /* BFS
    class Solution {
    public int maxDepth(TreeNode root) {
       if(root == null) return 0;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       int max=0;
       while(!q.isEmpty()){
       int qsize = q.size();
            while(qsize>0){
             TreeNode node = q.poll();
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
            qsize--;
            }
             max++;
       }
       return max;
    }
}*/
    /*Recursive DFS*/
class Solution {
   
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
         int max = Math.max(maxDepth(root.left) ,maxDepth(root.right)) +1;
         return max;
    }
}
