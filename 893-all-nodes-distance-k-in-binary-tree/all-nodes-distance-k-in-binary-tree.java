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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        TreeNode par[] = new TreeNode[501];
        if(root==null) return res;
        Queue<TreeNode> q= new LinkedList<>();
        link(root,q,par);
        q.clear();
        q.offer(target);
        boolean[] vis = new boolean[501];
        int r=0;
        while(!q.isEmpty() && r!=k){
            int n=q.size();
            
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                if(par[node.val]!=null && !vis[par[node.val].val]){
                    q.offer(par[node.val]);
                }
                if(node.left!=null && !vis[node.left.val]){
                    q.offer(node.left);
                }
                  if(node.right!=null && !vis[node.right.val]){
                    q.offer(node.right);
                }
                vis[node.val]=true;
            }
            r++;
        }
        while(!q.isEmpty()){
            res.add(q.poll().val);
        }
        return res;
    }
    public void link(TreeNode root,Queue<TreeNode> q,TreeNode[] par){
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node =q.poll();
            if(node.left!=null){
                par[node.left.val]=node;
                q.offer(node.left);
            }

            if(node.right!=null){
                par[node.right.val]=node;
                q.offer(node.right);
            }
        }
    }
}