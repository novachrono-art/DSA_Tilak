/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "N";
        StringBuilder sb = new StringBuilder();
        help1(root,sb);
        return sb.toString();
    }
    public void help1(TreeNode root,StringBuilder sb){
        if(root==null) {sb.append("N,");
        return;}
        sb.append(root.val).append(",");
        help1(root.left,sb);
        help1(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        int[] ind = {0};
        return help2(arr,ind);
    }
    public TreeNode help2(String[] arr, int[] ind){
        if(arr[ind[0]].equals("N")){
            ind[0]++;
            return null;
        }
        TreeNode root =new TreeNode(Integer.parseInt(arr[ind[0]]));
        ind[0]++;
        root.left =help2(arr,ind);
        root.right=help2(arr,ind);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));