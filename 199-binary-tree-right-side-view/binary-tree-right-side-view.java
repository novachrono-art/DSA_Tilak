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
   
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> res =new ArrayList<>();
         help(root,0,res);
         return res;
    }
    public void help(TreeNode node,int ind, List<Integer> res){
        if(node==null) return;
        if(ind==res.size()){
            res.add(node.val);
        }
        help(node.right,ind+1,res);
        help(node.left,ind+1,res);
    }
    
}