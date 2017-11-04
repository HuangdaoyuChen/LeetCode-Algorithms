//Given a singly linked list, determine if it is a palindrome.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null)
            return true;
        ListNode walker = head;
        ListNode runner = head;
        
        while (runner!= null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;
        }
        // now walker points to the midpoint
        // if odd nodes, let right half smaller
        if (runner != null)
            walker= walker.next; 
        
        walker = reverse(walker);
        while (walker != null) {
            if (head.val != walker.val)
                return false;
            head = head.next;
            walker = walker.next;
            
        }
        return true;
        
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
