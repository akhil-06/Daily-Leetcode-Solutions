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
     int carry = 0;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        
        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;
        
        int sum = val1 + val2 + carry;
        carry = sum/10;
        
        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;
        
        ListNode ans = new ListNode(sum%10, addTwoNumbers(l1, l2));
        
        return ans;
    }

    // public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     ListNode dummyHead = new ListNode(0);
    // ListNode p = l1, q = l2, curr = dummyHead;
    // int carry = 0;
    // while (p != null || q != null) {
    //     int x = (p != null) ? p.val : 0;
    //     int y = (q != null) ? q.val : 0;
    //     int sum = carry + x + y;
    //     carry = sum / 10;
    //     curr.next = new ListNode(sum % 10);
    //     curr = curr.next;
    //     if (p != null) p = p.next;
    //     if (q != null) q = q.next;
    // }
    // if (carry > 0) {
    //     curr.next = new ListNode(carry);
    // }
    // return dummyHead.next;
    // }
}