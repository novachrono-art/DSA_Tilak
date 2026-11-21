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
    HashMap<TreeNode,Integer> mp = new HashMap<>();
    public int rob(TreeNode root) {
        if(root==null) return 0;

        return help(root);
    }
    public int help(TreeNode root){
        if(root==null) return 0;
        int rob =root.val;
        if(mp.containsKey(root)) return mp.get(root);
        if(root.left!=null){
            rob+=help(root.left.left) + help(root.left.right);
        }
        if(root.right!=null){
            rob+=help(root.right.left) + help(root.right.right);
        }

        int not_rob=help(root.left) +help(root.right);
        int ans= Math.max(rob,not_rob);  
        mp.put(root,ans);
        return ans;
    }
}