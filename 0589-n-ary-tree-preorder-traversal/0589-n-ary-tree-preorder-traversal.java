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
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<Node>();
        if(root==null)
        return list;
        st.add(root);
        while(!st.isEmpty()){
            root = st.pop();
            list.add(root.val);
            if (root.children != null) {
            for (int i=root.children.size()- 1;i>=0;i--) {
            st.push(root.children.get(i));
                }
        }
    }
          return list;
    }
}