package se.mosverkstad.mosjava.leetcode.aax.swapNodesInPair;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class Solution {
	public ListNode<Integer> swapPairs(ListNode<Integer> head) {
		if (head == null || head.next == null) return head;
		ListNode<Integer> leftover = swapPairs(head.next.next);
		ListNode<Integer> next = head.next;
		head.next = leftover;
		next.next = head;
		return next;
	}
}
