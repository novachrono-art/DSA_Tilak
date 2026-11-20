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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return false;
        q.offer(root);
        boolean sibling=false;
        while(!q.isEmpty()){
            
            int size=q.size();
            int[] arr = new int[size];
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                 if(curr.left != null && curr.right != null) {
                    if((curr.left.val == x && curr.right.val == y) ||
                       (curr.left.val == y && curr.right.val == x)) {
                        sibling = true;
                    }
                }
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                arr[i]=curr.val;
            }
            int ct=0;
            for(int i=0;i<size;i++){
                if(arr[i]==x || arr[i]==y){
                    ct++;
                }
            }
            if(ct==2 && !sibling) return true;
        }
        return false;
    }
}