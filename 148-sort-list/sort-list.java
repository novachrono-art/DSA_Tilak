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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid =middle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        
        left = sortList(left);
        right = sortList(right);
        return merge(left,right);
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode d = new ListNode(0);
        ListNode curr=d;
        while(l1!=null && l2!=null){
            if(l2.val>=l1.val){
                curr.next=l1;
                l1=l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null){
            curr.next=l1;
        }
        if(l2!=null){
            curr.next=l2;
        }
        return d.next;
    }
    public ListNode middle(ListNode head){
        if(head==null && head.next==null) return null;
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}