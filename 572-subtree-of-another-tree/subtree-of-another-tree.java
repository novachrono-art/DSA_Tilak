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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return help(root,subRoot);
    }
    public boolean help(TreeNode root, TreeNode sb){
       if(root==null) return false;
       if(id(root,sb)){
        return true;
       }
        return help(root.left,sb) || help(root.right,sb); 
    }
    public boolean id(TreeNode n1,TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        return n1.val== n2.val && id(n1.left,n2.left) && id(n1.right,n2.right);
    } 
}