package se.mosverkstad.mosjava.leetcode.aau.mergeSortedLists;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class Solution {
	public ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
		if (l1 == null && l2 == null) return null;
		
		ListNode<Integer> point1 = l1, point2 = l2;
		ListNode<Integer> dummy = new ListNode<Integer>(-1);
		ListNode<Integer> point = dummy;
		while (point1 != null && point2 != null) {
			if (point1.val < point2.val) { point.next = point1; point1 = point1.next;}
			                        else { point.next = point2; point2 = point2.next;}
			point = point.next;
			point.next = null;
		}
		point.next = (point1 != null)? point1 : point2;
		point = dummy.next;
		dummy.next = null;
		return point;
	}
}
