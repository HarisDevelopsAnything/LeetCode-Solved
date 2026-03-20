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
        int n1, n2;
        int d;
        ListNode cl1, cl2;
        cl1 = l1;
        cl2 = l2;
        d=10;
        int carry = 0;
        ListNode res = new ListNode();
        ListNode temp  = res;
        int sum=-1;
        while((cl1 != null || cl2!=null)){
            if(cl1 == null) n1 = 0;
            else {n1 = cl1.val; cl1 = cl1.next;}
            if(cl2 == null) n2 = 0;
            else {n2 = cl2.val; cl2 = cl2.next; }
            sum = n1+n2+carry;
            if(sum>9) {
                sum=sum-10;
                carry = 1;
            }
            else carry = 0;
            res.next = new ListNode(sum);
            res = res.next;
            if(cl1==null && cl2==null){
                if(carry == 1){
                    res.next = new ListNode(1);
                }
            }
        }
        
        return temp.next;
    }
}