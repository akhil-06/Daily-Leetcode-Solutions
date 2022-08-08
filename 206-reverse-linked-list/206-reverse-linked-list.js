/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
//TC -> O(n) SC->O(1)
var reverseList = function(head) {
    let prev = null;
    let curr = head;
    let next = null;
    
    while(curr!==null){
        //save next 
        next = curr.next;
        //making link in opposite direction
        curr.next = prev
        //incrementation of the next and prev;
        prev = curr;
        curr = next;
    }
    return prev;
};