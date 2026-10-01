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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode tem=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=tem.val;
            tem=tem.next;
        }
        int le=0;
        int ri=len-1;
        while(le<ri){
            if(arr[le]!=arr[ri]){
                return false;
            }
            le++;
            ri--;
        }
        return true;
    }
}