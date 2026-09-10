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
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nextNode = null;
        ListNode prevNode = null;
        while(slow != null){
            nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }
        ListNode start = head;
        ListNode end = prevNode;
        while(end.next != null){
            ListNode safe_start = start.next;
            ListNode safe_end = end.next;
            start.next = end;
            start = safe_start;
            end.next = safe_start;
            end = safe_end;
        }
    }
}