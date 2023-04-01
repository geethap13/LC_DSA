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
    public int goodNodesHelper(TreeNode root,int max) {
        if(root == null) return 0;
        int res = root.val>= max ? 1:0;
        res += root.left!=null?goodNodesHelper(root.left,Math.max(max,root.left.val)):0;
        res += root.right!=null?goodNodesHelper(root.right,Math.max(max,root.right.val)):0;
        return res;
    }
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        
        return goodNodesHelper(root,root.val);
        
    }
}