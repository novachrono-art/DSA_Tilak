/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode curr = head;
      HashSet<ListNode> s = new HashSet<>();
      while(curr!=null){
        if(s.contains(curr)) return true;
        s.add(curr);
        curr=curr.next;
      }
      return false;
    }
}