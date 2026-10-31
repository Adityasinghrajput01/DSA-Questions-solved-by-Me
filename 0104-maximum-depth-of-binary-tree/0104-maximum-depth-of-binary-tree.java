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
    public int maxDepth(TreeNode root) {
        return calculate(root);
    }
    public int calculate(TreeNode root){
        if(root==null)
        return 0;
        int lefti = calculate(root.left);
        int righti = calculate(root.right);
        return 1 + Integer.max(lefti,righti);
    }
}