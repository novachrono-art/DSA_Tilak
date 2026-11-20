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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        help(root,targetSum,new ArrayList<>());
        return res;
    }
    public void help(TreeNode curr, int tar,List<Integer> li){
         if(curr==null) return;
         li.add(curr.val);
         tar-=curr.val;
        if(curr.left==null && curr.right==null && tar==0){
            res.add(new ArrayList<>(li));
            
        }
        else{        
        help(curr.left,tar,li);
        help(curr.right,tar,li);
        }

        li.remove(li.size()-1);

    }
}