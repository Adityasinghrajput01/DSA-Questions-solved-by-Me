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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> st = new Stack<Node>();
        if(root == null)
        return list;
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            if(root.children!=null){
                for(int i = 0;i<root.children.size();i++)
                st.push(root.children.get(i));
            }
            list.add(root.val);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i = list.size()-1;i>=0;i--)
           list2.add(list.get(i));
           return list2;
    }
}