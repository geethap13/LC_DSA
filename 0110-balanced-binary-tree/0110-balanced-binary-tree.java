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
    class Pair{
        boolean isBalanced;
        int height;
        Pair(boolean _isB,int _h){
            isBalanced = _isB;
            height = _h;
        }
    }
     public Pair isBalancedHelper(TreeNode root) {
        if(root == null ) return new Pair(true,0);
        
        Pair left = isBalancedHelper(root.left);
        Pair right = isBalancedHelper(root.right);
        if(left.isBalanced && right.isBalanced && Math.abs(left.height - right.height)<=1)
          return new Pair(true,Math.max(left.height,right.height)+1);
        return new Pair(false,Math.max(left.height,right.height)+1);
    }
    public boolean isBalanced(TreeNode root) {
        Pair p = isBalancedHelper(root);
        return p.isBalanced;
    }
}
*/

class Solution {
    public int isBalancedHelper(TreeNode root){
        if(root == null) return 0;
        
        int lefth = isBalancedHelper(root.left);
        if(lefth == -1 ) return -1;
        int righth = isBalancedHelper(root.right);
         if(righth == -1 ) return -1;

         if(Math.abs(lefth -righth)>1) return -1;
         return 1+Math.max(lefth,righth);
    }
    public boolean isBalanced(TreeNode root) {
        return isBalancedHelper(root)!=-1;
    }
}