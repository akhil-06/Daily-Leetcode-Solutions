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
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode tail = head.next;
        
        ListNode reverse = reverse(head.next);
        
        tail.next = head;
        head.next = null;
        return reverse;
        
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
             slow = slow.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while(slow!= null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
        
        
    }
}