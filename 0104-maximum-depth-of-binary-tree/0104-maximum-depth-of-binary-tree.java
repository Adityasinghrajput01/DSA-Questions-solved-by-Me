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
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return 0;
        int count = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int l = queue.size();
            for(int i = 0;i<l;i++){
                TreeNode n = queue.poll();
                if(n.left!=null)queue.offer(n.left);
                if(n.right!=null)queue.offer(n.right);
            }
            count++;
        }
        return count;
    }
}