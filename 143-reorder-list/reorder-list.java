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
    public void reorderList(ListNode head) {
        List<ListNode> li = new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            li.add(curr);
            curr=curr.next;
        }
        int le=0;
        int ri=li.size()-1;
        while(le<ri){
            li.get(le).next =li.get(ri);
            le++;
            if(le==ri) break;

            li.get(ri).next = li.get(le);
            ri--;
        }
        li.get(le).next=null;
    }
}