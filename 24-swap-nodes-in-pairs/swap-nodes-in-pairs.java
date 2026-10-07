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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        List<ListNode> li = new ArrayList<>();
        ListNode curr =head;
        
        while(curr!=null){
            li.add(curr);
            curr=curr.next;
        }
        int len=li.size();
        for(int i=0;i<len-1;i+=2){
        ListNode first=li.get(i);
        ListNode second=li.get(i+1);
        li.set(i,second);
        li.set(i+1,first);
      }
      for(int i=0;i<len-1;i++){
           li.get(i).next = li.get(i+1);
      }
      li.get(len-1).next=null;
      return li.get(0);
    }
}