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
    public ListNode removeNodes(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        while(head!=null){
            temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        temp=prev.next;
        prev.next=null;
        while(temp!=null){
            ListNode p=temp.next;
            if(temp.val>=prev.val){
                temp.next=prev;
                prev=temp;
            }
            temp=p;
        }
        return prev;
    }
}