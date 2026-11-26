/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode curr = head;
        int ct=0;
        while(curr!=null){
            ct++;
            curr=curr.next;
        }
        curr=head;
        int i=0;
        int[] arr = new int[ct];
        while(curr!=null){
             arr[i]=curr.val;
             i++;
             curr=curr.next;
        }
        i=0;
        int j=arr.length-1;
        TreeNode root=null;
        return help(root,i,j,arr);
    }
    public TreeNode help(TreeNode root,int i,int j,int[] arr){
            if(i>j) return null;
            int mid = (i+j)/2;
            root =new TreeNode(arr[mid]);
            root.left=help(root,i,mid-1,arr);
            root.right =help(root,mid+1,j,arr);
            return root;
    }
}