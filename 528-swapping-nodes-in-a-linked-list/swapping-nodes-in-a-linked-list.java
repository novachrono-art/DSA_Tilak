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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
         ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head=head.next;
        }
        int[] arr=new int[list.size()];
        for (int i = 0;i<list.size();i++) {
            arr[i] = list.get(i);
        }
        int p=k-1;
        int q=arr.length-k;
        int te = arr[p];
        arr[p] = arr[q];
        arr[q] = te;
        
          if (arr.length == 0)
            return null;
        ListNode b = new ListNode(arr[0]);
        ListNode current = b;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return b;
    }
}
