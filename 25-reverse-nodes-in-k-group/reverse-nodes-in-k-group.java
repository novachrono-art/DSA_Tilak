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
    public ListNode reverseKGroup(ListNode head, int k) {
        int n=0;
        ListNode curr=head;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int arr[] = new int[n];
        curr=head;
        int i=0;
        while(curr!=null){
             arr[i]=curr.val;
             curr=curr.next;
             i++;
        }
        int x=0;
        while(x<=n-k){
            int left=x;
            int right=x+k-1;
            while(left<right){
                int t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
            x+=k;
        }
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