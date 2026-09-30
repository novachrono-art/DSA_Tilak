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
    public ListNode deleteDuplicates(ListNode head) {
        int[] ct =new int[201];
        ListNode curr = head;
        while(curr!=null){
            ct[curr.val+100]++;
            curr=curr.next;
        }
        ListNode d = new ListNode(0);
        ListNode ans =d;
        curr=head;
        while(curr!=null){
            if(ct[curr.val+100]==1){
                ans.next = new ListNode(curr.val);
                ans=ans.next;
            } curr=curr.next;
        }
        return d.next;
    }
}