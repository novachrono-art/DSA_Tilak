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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int arr[] =new int[len];
        temp=head;
        for(int i=0;i<len;i++){
            arr[i]=temp.val;
            temp=temp.next;
        }
        ListNode d = new ListNode(0);
        ListNode curr= d;
        for(int i=0;i<len;i++){
            if(i%2==0){
                curr.next = new ListNode(arr[i]);
                curr=curr.next;
            }
        }
         for(int i=0;i<len;i++){
            if(i%2!=0){
                curr.next = new ListNode(arr[i]);
                curr=curr.next;
            }
        }
        return d.next;
    }
}