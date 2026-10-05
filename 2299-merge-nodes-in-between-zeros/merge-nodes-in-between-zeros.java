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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode tr=curr;
        while(tr!=null){
            int sum=0;
            while(tr!=null && tr.val!=0){
                sum+=tr.val;
                tr=tr.next;
            }
            curr.val=sum;
            if(tr.next==null) {
                curr.next=null;
                break;
            }
            tr =tr.next;
            curr.next=tr;
            curr=curr.next;
        }
        return head.next;
    }
}