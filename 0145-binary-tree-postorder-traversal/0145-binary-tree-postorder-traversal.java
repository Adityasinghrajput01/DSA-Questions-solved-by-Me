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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list  =new ArrayList<>();
        solve(list,root);
        return list;
    }
    public void solve(List<Integer> list , TreeNode root){
        if(root==null)
        return;
        solve(list,root.left);
        solve(list,root.right);
        list.add(root.val);
    }
}