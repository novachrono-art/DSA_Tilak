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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res =new ArrayList<>();
        int i=0;
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size= q.size();
            List<Integer> li  =new ArrayList<>();
        for(int j=0;j<size;j++){
            TreeNode curr = q.poll();
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
            li.add(curr.val);
        }
        if(i%2==0){
            res.add(li);
            i++;
        }
        else{
            Collections.reverse(li);
            res.add(li);
            i++;
        }

        }
        return res;
    }
}