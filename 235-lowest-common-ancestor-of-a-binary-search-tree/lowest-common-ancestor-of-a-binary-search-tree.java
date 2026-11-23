/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return help(root,p,q);
    }
    public TreeNode help(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return null;
        if(p.val<root.val && q.val<root.val){
            return help(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return help(root.right,p,q);
        }
        return root;
        
    }
}