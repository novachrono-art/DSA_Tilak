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
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int[] arr = new int[n]; 
        curr=head;
        int i=0;
        while(curr!=null){
            if(curr.val<x){
                arr[i] =curr.val;
                i++;
            }
            curr=curr.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.val>=x){
                arr[i]=curr.val;
                i++;
            }
            curr=curr.next;
        }
        i=0;
        curr=head;
        while(curr!=null){
            curr.val=arr[i];
            i++;
            curr=curr.next;
        }

       return head;
    }
}