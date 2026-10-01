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
    public ListNode deleteMiddle(ListNode head) {
        int len=0;
        if(head==null || head.next==null) return null;
        ListNode curr =head;
        ListNode temp=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int mid=len/2;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}