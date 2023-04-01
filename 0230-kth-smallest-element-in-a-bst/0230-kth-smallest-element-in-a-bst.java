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
     public void kthSmallestHelper(TreeNode root, ArrayList<Integer> res) {
         if(root == null) return;
         kthSmallestHelper(root.left,res);
         res.add(root.val);
         kthSmallestHelper(root.right,res);
     }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        kthSmallestHelper(root,res);
        System.out.println(res);
        return res.get(k-1);
    }
}