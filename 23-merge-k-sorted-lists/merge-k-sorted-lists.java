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
    public ListNode mergeKLists(ListNode[] lists) {
        int ct=0;
        ListNode dummy = new ListNode(0);
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                ct++;
                head=head.next;
            }
        }
       if(ct==0) return null;
       int[] arr= new int[ct];
       int k=0;
       for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                arr[k]=head.val;
                k++;
                head=head.next;
            }
        }
    
        Arrays.sort(arr);
        ListNode curr=dummy;
        k=0;
        while(k<ct){
            curr.next =new ListNode(arr[k]);
            k++;
            curr=curr.next;
        }
        return dummy.next;
    }
}