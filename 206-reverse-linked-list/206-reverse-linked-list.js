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
var reverseList = function(head) {
    var temp = null;
    var newH = null;
    while(head != null){
        temp = head;
        head = head.next;
        temp.next = newH;
        newH = temp;
    }
    return newH;
};