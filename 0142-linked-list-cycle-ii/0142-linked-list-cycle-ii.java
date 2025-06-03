/**
 * Definition for singly-linked list.
 * class ListNode {
 *  int val;
 *  ListNode next;
 *  ListNode(int x) {
 *  val = x;
 *  next = null;
 *  }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 step and fast by 2 steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet, there is a cycle
            if (slow == fast) {
                // Move slow back to the start to find the entry point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // The node at which the cycle begins
            }
        }

        return null; // No cycle found
    }
}
