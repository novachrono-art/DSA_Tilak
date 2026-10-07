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
    public int[] nextLargerNodes(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        int n=0;
       
        while(head!=null){
            n++;
            curr=head.next;
            head.next=prev;
            prev=head;
            head=curr;
        }
        int arr[] =new int[n];
        Stack<Integer> st = new Stack();
        st.push(prev.val);
        prev=prev.next;
        arr[n-1]=0;
        int i=n-2;
        while(prev!=null){
            
               while(!st.isEmpty() && prev.val>=st.peek()){
                st.pop();
               }
               arr[i] =st.isEmpty()?0:st.peek();
               st.push(prev.val);
               i--;
            prev=prev.next;
        }
        
       return arr;
    }
}