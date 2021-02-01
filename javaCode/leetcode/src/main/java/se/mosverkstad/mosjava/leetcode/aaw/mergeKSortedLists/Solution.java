package se.mosverkstad.mosjava.leetcode.aaw.mergeKSortedLists;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;
import se.mosverkstad.mosjava.leetcode.helper.ListNodeIntegerComparator;
import se.mosverkstad.mosjava.leetcode.helper.MinHeap;

public class Solution {
	public ListNode<Integer> mergeKLists(ListNode<Integer>[] lists) {
		MinHeap<ListNode<Integer>> heap = new MinHeap<ListNode<Integer>>(new ListNodeIntegerComparator());
		for (ListNode<Integer> node:lists) {
			if (node != null) heap.push(node);
		}
		ListNode<Integer> head = new ListNode<Integer>(-1), current = head;
		
		
		while (heap.size() > 0) {
			ListNode<Integer> min = heap.popup();
			if (min.next != null) heap.push(min.next);
			current.next = min;
			current = current.next;
			current.next = null;
		}
		current = head;
		head = head.next;
		current.next = null;
		return head;
	}
}
