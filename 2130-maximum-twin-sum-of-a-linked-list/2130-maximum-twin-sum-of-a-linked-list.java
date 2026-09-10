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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while(cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        int n = list.size();
        int maxSum = 0;
        for(int i = 0; i < n/2; i++){
            int sum = list.get(i) + list.get(n-1-i);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}