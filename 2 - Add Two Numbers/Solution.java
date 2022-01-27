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
        int carry = 0;
        int ten = 0;
        int sum =0;
        ListNode initialNode = new ListNode(0);
        ListNode current = initialNode;

        while( l1 != null || l2  != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            sum = x + y + ten;
            carry =sum%10;
            ten = (sum/10)%10;

            current.next = new ListNode(carry);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (ten != 0) {
            current.next = new ListNode(ten);
        }
        return initialNode.next;
        
    }
}
