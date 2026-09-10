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
    public ListNode partition(ListNode head, int x) {
        ListNode res1 = new ListNode(0);
        ListNode cur1 = res1;
        ListNode res2 = new ListNode(0);
        ListNode cur2 = res2;
        while(head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = cur1.next;
            }
            else{
                cur2.next = head;
                cur2 = cur2.next;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = res2.next;
        return res1.next;
    }
}