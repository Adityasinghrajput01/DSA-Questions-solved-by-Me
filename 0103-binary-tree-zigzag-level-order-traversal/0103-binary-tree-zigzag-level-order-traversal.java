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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
        return list;
        queue.offer(root);
         boolean k = true;
        while(!queue.isEmpty()){
            List<Integer> sub = new ArrayList<>();
            int l  = queue.size();
            for(int i = 0;i<l ;i++){
                TreeNode node = queue.poll();
                if(k)
                sub.addLast(node.val);
                else
                sub.addFirst(node.val);
                    if(node.left!=null) queue.offer(node.left);
                    if(node.right!=null) queue.offer(node.right);
            }
            k = !k;
            list.add(sub);
        }
        return list;
    }
}