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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode temp = res;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list1.val <= list2.val){
            res.val = list1.val;
            list1 = list1.next;
        }
        else{
            res.val = list2.val;
            list2 = list2.next;
        }
        while(list1!=null || list2!=null){
            if(list1 == null){
                res.next = list2;
                list2 = list2.next;
                res = res.next;
            }
            else if(list2 == null){
                res.next = list1;
                list1 = list1.next;
                res = res.next;
            }
            else{
                if(list1.val <= list2.val){
                    res.next = list1;
                    list1 = list1.next;
                    res = res.next;
                }
                else{
                    res.next = list2;
                    list2 = list2.next;
                    res= res.next;
                }
            }
        }
        return temp;
    }
}