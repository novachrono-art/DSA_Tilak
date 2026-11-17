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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return help(root.left,root.right);
    }
    public boolean help(TreeNode r1,TreeNode r2){
        if(r1==null || r2==null) return r1==r2;
        if(r1.val==r2.val){
            boolean ans1= help(r1.left,r2.right);
            boolean ans2 =help(r1.right,r2.left);
            return ans1 && ans2;
        }
        else{
            return false;
        }

    }
}