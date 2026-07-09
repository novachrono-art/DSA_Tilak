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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left =head,right=head;
        for(int i=1;i<k;i++){
            right=right.next;
        }
        ListNode curr = right;
        while(curr.next!=null){
            curr=curr.next;
            left=left.next;
        }
        int t = right.val;
        right.val = left.val;
        left.val = t;

        return head;
    }
}