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
        int i=li1.size()-1;
        int j=li2.size()-1;
        int carry=0;
        while(i>=0 && j>=0){
              int sum=carry;
              sum+=li1.get(i)+li2.get(j);
              i--;
              j--;
              carry=sum/10;
              ListNode node = new ListNode(sum % 10);
           node.next = d.next;
           d.next = node;
        }
        while(i>=0){
            int sum=carry;
            sum+=li1.get(i);
           ListNode node = new ListNode(sum % 10);
           node.next = d.next;
           d.next = node;
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=carry;
            sum+=li2.get(j);
            ListNode node = new ListNode(sum % 10);
            node.next = d.next;
            d.next = node;
            carry=sum/10;
            j--;
          
        }
        if(carry!=0){
           ListNode node = new ListNode(carry);
            node.next = d.next;
            d.next = node;
        }
        return d.next;
    }
}