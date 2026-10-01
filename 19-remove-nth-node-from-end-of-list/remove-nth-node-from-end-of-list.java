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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr =head;
        ListNode d =new ListNode(0,head);
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int k=len-n;
        curr=d;
        while(k>0){
            curr=curr.next;
            k--;
        }
        curr.next=curr.next.next;
         
         return d.next;
    }
}