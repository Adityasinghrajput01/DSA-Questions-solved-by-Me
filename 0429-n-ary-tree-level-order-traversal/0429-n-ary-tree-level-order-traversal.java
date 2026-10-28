/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
      List<List<Integer>> list = new ArrayList<>();
      Queue<Node> queue = new LinkedList<>();
      if(root==null)
      return list;
      queue.offer(root);
      while(!queue.isEmpty()){
        int l = queue.size();
        List<Integer> sub = new ArrayList<>();
        for(int i = 0;i<l;i++){
            Node node = queue.poll();
            sub.add(node.val);
            if(node.children!=null)
            for(Node child : node.children){
                queue.offer(child);
            }
        }
        list.add(sub);
      }  
      return list;
    }
}