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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        if(res==null) return head;
        int currval = res.val;
        while(res!=null){
            currval = res.val;
            if(res.next!=null && res.next.val == currval){
                res.next = res.next.next;
            }
            if(res.next==null || res.next.val!=currval)
            res = res.next;
        }
        return head;
    }
}