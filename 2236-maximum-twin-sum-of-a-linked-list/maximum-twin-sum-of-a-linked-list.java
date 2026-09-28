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
    public int pairSum(ListNode head) {
        if(head==null) return 0;
        ListNode curr=head;
        List<Integer> li = new ArrayList<>();
        while(curr!=null){
            li.add(curr.val);
            curr=curr.next;
        }
        int sum=0;
        int left=0;
        int right=li.size()-1;
        while(left<right){
           int currsum=li.get(left)+li.get(right);
           sum=Math.max(sum,currsum);
           left++;
           right--;
        }
        return sum;
    }
}