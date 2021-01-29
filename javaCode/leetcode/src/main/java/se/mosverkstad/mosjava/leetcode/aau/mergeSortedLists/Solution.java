package se.mosverkstad.mosjava.leetcode.aau.mergeSortedLists;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) return null;
		
		ListNode point1 = l1, point2 = l2;
		ListNode dummy = new ListNode(-1);
		ListNode point = dummy;
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
