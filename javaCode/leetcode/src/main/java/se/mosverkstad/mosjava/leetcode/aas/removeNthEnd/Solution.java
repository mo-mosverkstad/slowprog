package se.mosverkstad.mosjava.leetcode.aas.removeNthEnd;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class Solution {
	public ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
		ListNode<Integer> current = head, previous = head;
		for (int i = 0; i < n && current != null; i++) current = current.next;
		if (current == null) {
			ListNode<Integer> deletedNode = head;
			head = head.next;
			deletedNode.next = null;
		} else {
			while (current.next != null) {
				current = current.next;
				previous = previous.next;
			}
			ListNode<Integer> deletedNode = previous.next;
			previous.next = deletedNode.next;
			deletedNode.next = null;
		}
		
        return head;
    }
}
