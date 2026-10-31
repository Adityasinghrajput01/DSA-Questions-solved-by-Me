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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null)
        return true;
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            List<Integer> list =  new ArrayList<>();
            int l = queue.size();
            for(int i = 0;i<l;i++){
                TreeNode node = queue.poll();
                if (level%2==0 && node.val%2==0)
                return false;
                if (level%2!=0 && node.val%2!=0)
                return false;
                list.add(node.val);
                if(node.left!=null)
                queue.offer(node.left);
                if(node.right!=null)
                queue.offer(node.right);
            }
            if(level%2==0)
            {
            for(int i = 0;i<list.size()-1;i++){
            if (list.get(i)>=list.get(i+1))
            return false;
                }
            }
            else{
             for(int i = 0;i<list.size()-1;i++){
             if(list.get(i)<=list.get(i+1))
            return false;
                }   
            }
            level++;
        }
        return true;
    }
}