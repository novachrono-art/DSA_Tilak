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
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        help(root,res);
        return res;
    }
    public void help(Node node, List<Integer> li){
       if(node==null) return;
       li.add(node.val);
       int k=node.children.size();
       int i=0;
       while(i<k){
          help(node.children.get(i),li);
          i++;
       }
    }
}