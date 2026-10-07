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
        ListNode curr= head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int arr[] = new int[len];
        curr=head;
        int i=0;
        while(curr!=null){
            arr[i]=curr.val;
            i++;
            curr=curr.next;
        }
        Arrays.sort(arr);
        curr=head;
        i=0;
        while(curr!=null){
            curr.val=arr[i];
            i++;
            curr=curr.next;
        }
        return head;
    }
}