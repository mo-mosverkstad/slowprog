package se.mosverkstad.mosjava.leetcode.helper;

import java.util.Comparator;

public class ListNodeIntegerComparator implements Comparator<ListNode<Integer>> {

	public int compare(ListNode<Integer> o1, ListNode<Integer> o2) {
		return o1.val - o2.val;
	}

}
