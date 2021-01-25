package se.mosverkstad.mosjava.leetcode.aas.removeNthEnd;

public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode current = head, previous = head;
		for (int i = 0; i < n && current != null; i++) current = current.next;
		if (current == null) {
			ListNode deletedNode = head;
			head = head.next;
			deletedNode.next = null;
		} else {
			while (current.next != null) {
				current = current.next;
				previous = previous.next;
			}
			ListNode deletedNode = previous.next;
			previous.next = deletedNode.next;
			deletedNode.next = null;
		}
		
        return head;
    }
}
