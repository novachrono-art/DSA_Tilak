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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0);
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        while(l1!=null){
            li1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            li2.add(l2.val);
            l2=l2.next;
        }
        ListNode curr=d;
        int i=0;
        int j=0;
        int carry=0;
        while(i<li1.size() && j<li2.size()){
              int sum=carry;
              sum+=li1.get(i)+li2.get(j);
              i++;
              j++;
              carry=sum/10;
              curr.next= new ListNode(sum%10);
              curr=curr.next;
        }
        while(i<li1.size()){
            int sum=carry;
            sum+=li1.get(i);
            curr.next =new ListNode(sum%10);
            carry=sum/10;
            i++;
            curr=curr.next;
        }
        while(j<li2.size()){
            int sum=carry;
            sum+=li2.get(j);
            curr.next =new ListNode(sum%10);
            carry=sum/10;
            j++;
            curr=curr.next;
        }
        if(carry!=0){
           curr.next= new ListNode(carry);
        }
        return d.next;
    }
}