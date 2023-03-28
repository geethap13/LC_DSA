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
 class Solution {
    int maxi = 0;
    public int findHeight(TreeNode root){
        if(root == null) return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if(root == null) return 0;
         if(root.left==null && root.right==null)
             return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        diameterOfBinaryTreeHelper(root.left);
        diameterOfBinaryTreeHelper(root.right);
        maxi = Math.max(lh+rh,maxi);
        return maxi;

    }
      public int diameterOfBinaryTree(TreeNode root) {
         diameterOfBinaryTreeHelper(root);
         return maxi;
      }
}
*/
class Solution {
    int maxi = 0;
    public int findHeight(TreeNode root){
        if(root == null) return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTreeHelper(TreeNode root) {
        if(root == null) return 0;
        //  if(root.left==null && root.right==null)
        //      return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        diameterOfBinaryTreeHelper(root.left);
        diameterOfBinaryTreeHelper(root.right);
        maxi = Math.max(lh+rh,maxi);
        return maxi;

    }
      public int diameterOfBinaryTree(TreeNode root) {
         diameterOfBinaryTreeHelper(root);
         return maxi;
      }
}