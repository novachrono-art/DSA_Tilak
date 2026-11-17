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
    int ct=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        help(root,targetSum);
        if(ct>0) return true;
        return false;
    }
    public void help(TreeNode node, int ts){
        if(node==null) return;
        ts=ts-node.val;
        if(node.left==null && node.right==null){
            if(ts==0) ct++;
            return;
        }
        help(node.left,ts);
        help(node.right,ts);
    }
}