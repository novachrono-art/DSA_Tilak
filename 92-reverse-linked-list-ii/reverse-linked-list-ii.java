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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return head;
        int ct=1;
        ListNode curr = head;
        while(curr!=null){
            ct++;
            curr=curr.next;
        }
        int[] arr = new int[ct];
        int i=0;
        curr=head;
        while(curr!=null){
            arr[i]=curr.val;
            curr=curr.next;
            i++;
        }
        int le=left-1;
        int ri=right-1;
        while(le<ri){
            int t=arr[le];
            arr[le]=arr[ri];
            arr[ri]=t;
            le++;
            ri--;
        }
        curr = head;
        i=0;
        while(curr!=null){
            curr.val=arr[i];
            i++;
            curr=curr.next;
        }
        return head;
    }
}