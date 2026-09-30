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
        ListNode d = new ListNode(-1);
        ListNode prev = d;
        prev.next=head;
        ListNode curr =head;
        while(curr!=null){
            boolean dup =false;
            while(curr.next!=null && curr.val==curr.next.val){
                dup=true;
                curr=curr.next;
            }
            if(dup){
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }
            curr=curr.next;

        }
       return d.next;
    }
}