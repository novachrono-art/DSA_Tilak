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
    public ListNode deleteDuplicates(ListNode head) {
        // Set<ListNode> s = new HashSet<>();
        // ListNode curr=head;
        // ListNode prev =head;
        // while(curr!=null){
        //     if(s.contains(curr)){
        //         ListNode dup =curr;
        //         prev =curr.next.next;
        //         curr=curr.next;
                
        //     }
        //     else{
        //         s.add(curr);
        //         curr=curr.next;
        //     }
        // }
        // return head;
        if(head==null) return head;
        int ct=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            ct++;
        }
        int arr[] = new int[ct];
        curr =head;
        int i=0;
        while(curr!=null){
            arr[i]= curr.val;
            curr=curr.next;
            i++;
        }
        ListNode prev=null;
        curr = head;
        Set<Integer> s = new HashSet<>();
        
        for(int j=0;j<arr.length;j++){
            if(!s.contains(arr[j])){
                s.add(arr[j]);
                curr.val =arr[j];
                prev = curr;
                curr = curr.next;
            }
            
        } 
        if(prev!=null){ prev.next=null;
        }
        return head;
    }
}