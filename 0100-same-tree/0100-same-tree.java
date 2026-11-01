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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.offer(p);
        queue2.offer(q);
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode n1 = queue1.poll();
            TreeNode n2 = queue2.poll();
            if (n1 == null && n2 == null)
                continue;
            if (n1 == null || n2 == null)
                return false;
            if (n1.val != n2.val)
                return false;
            queue1.offer(n1.left);
            queue1.offer(n1.right);
            queue2.offer(n2.left);
            queue2.offer(n2.right);
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }
}