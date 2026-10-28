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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE,levi =0;
        List<Integer> list =  new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return 0;
        queue.offer(root);
         int lev = 1;
        while(!queue.isEmpty()){
            int sum = 0;
            int l = queue.size();
            for(int i = 0;i<l;i++){
                TreeNode node = queue.poll();
                sum = sum+node.val;
                if(node.left!=null)
                queue.offer(node.left);
                if(node.right!=null)
                queue.offer(node.right);
            }
            if(sum>max){
                max = sum;
                levi = lev;
            }
            lev++;
        }
        return levi;
    }
}