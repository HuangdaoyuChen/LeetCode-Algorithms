//Reverse a singly linked list.



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; //store next pointer
            curr.next = prev; //change the next pointer to point the previous node
            
            prev = curr; 
            curr = nextTemp;
        }
        return prev;
    }
}
/*
Complexity analysis

Time complexity : O(n). Assume that n is the list's length, the time complexity is O(n)

Space complexity : O(1)
*/
