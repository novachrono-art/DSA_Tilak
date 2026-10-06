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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        ListNode curr=head;
        int n=0;

        while(curr!=null){
            n++;
            curr=curr.next;
        }
        k=k%n;  
        if(k==0) return head;
        curr=head;
       for(int i=0;i<n-k-1;i++){
          curr=curr.next;
       }
       ListNode temp=curr.next;
       curr.next=null;
       ListNode tr =temp;
       while(tr.next!=null){
         tr=tr.next;
       }
       tr.next=head;
    //    curr.next=null;
       return temp;
    }
}