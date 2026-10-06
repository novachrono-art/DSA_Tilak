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
    public void reverse(int[] arr,int left,int right){
        while(left<right){
            int t = arr[left];
            arr[left] =arr[right];
            arr[right]=t;
            left++;
            right--;
        }
    }
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
       int arr[] =new int[n];
       curr=head;
       int i=0;
       while(curr!=null){
          arr[i]=curr.val;
          i++;
          curr=curr.next;
       }
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
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