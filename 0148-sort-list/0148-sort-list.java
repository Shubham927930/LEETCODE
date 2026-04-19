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
    public ListNode sortList(ListNode head) {
     List<Integer> arr = new ArrayList<>();
     ListNode temp = head;

     while(temp!=null){
        arr.add(temp.val);
        temp=temp.next;
     }   

     Collections.sort(arr);

     temp = head;

     while(arr.size()>0){
        temp.val = arr.removeFirst();
        temp = temp.next;
     }

     return head;
    }
}