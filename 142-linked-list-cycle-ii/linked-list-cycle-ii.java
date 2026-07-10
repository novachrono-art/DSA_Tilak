/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null || head.next==null) return null;
        ListNode temp=head;
        ListNode p=head;
        
        while(p!=null && p.next!=null){
            
             temp=temp.next;
             p=p.next.next;
             if(temp==p) break;
        }
        if(p==null || p.next==null)  return null;
        while(head!=p){
            head=head.next;
            p=p.next;
        }
        return head;
       
    }
}