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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
        return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            double avg = 0;
            int count = 0;
            int l = queue.size();
            for(int i = 0;i<l;i++){
                TreeNode node = queue.poll();
                avg += node.val;
                count++;
                if(node.left!=null)queue.offer(node.left);
                if(node.right!=null)queue.offer(node.right);
            }
            list.add(avg/count);
        }
        return list;
    }
}