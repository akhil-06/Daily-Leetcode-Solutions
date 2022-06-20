/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let fast = head;
    let slow = head;
    if(head === null) return false;
    while(fast && fast.next!==null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow === fast) return true;
    }
    return false;
};