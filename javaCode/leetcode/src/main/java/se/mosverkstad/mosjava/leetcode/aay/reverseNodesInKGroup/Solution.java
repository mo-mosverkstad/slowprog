package se.mosverkstad.mosjava.leetcode.aay.reverseNodesInKGroup;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class Solution {
	public ListNode<Integer> reverseKGroup(ListNode<Integer> head, int k) {
		if (head == null) return head;
		ListNode<Integer> current = head, newHead = null, leftover = null;
		int count = 1;
		for (; current != null && count < k; current = current.next, count++);
		if (count == k && current != null) {
			leftover = current.next;
			newHead = reverseInGroup(head, k);
			head.next = reverseKGroup(leftover, k);
			return newHead;
		} else {
			return head;
		}
	}
	
	private ListNode<Integer> reverseInGroup(ListNode<Integer> head, int k) {
		if (head == null) return head;
		ListNode<Integer> current = head;
		ListNode<Integer> previous = null, next = null;
		for (int i = 0; i < k; i++) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
}
