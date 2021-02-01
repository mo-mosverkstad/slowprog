package se.mosverkstad.mosjava.leetcode.helper;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.mosverkstad.mosjava.leetcode.helper.ListNode;
import se.mosverkstad.mosjava.leetcode.helper.MinHeap;

public class SolutionTest extends TestCase {
	private MinHeap<ListNode<Integer>> heap = new MinHeap<ListNode<Integer>>(new ListNodeIntegerComparator());

	public void testSolution01() {
		Assert.assertTrue("1, 3, 2, 6, 5, 4, 3, ".equals(addToHeap(new int[]{3,2,1,6,5,4,3})));
		Assert.assertTrue(popupFromHeap(new int[]{1,2,3,3,4,5,6}));
	}
	
	public void testSolution02() {
		Assert.assertTrue("1, 2, 6, 3, 2, 7, 6, 7, 6, 9, ".equals(addToHeap(new int[]{7,6,7,6,9,2,6,1,3,2})));
		Assert.assertTrue(popupFromHeap(new int[]{1,2,2,3,6,6,6,7,7,9}));
	}
	
	private String addToHeap(int[] nums) {
		heap.clear();
		for (int n : nums) {
			heap.push(new ListNode<Integer>(n));
		}
		return heap.toString();
	}
	
	private boolean popupFromHeap(int[] nums) {
		for (int n : nums) {
			if (heap.popup().val != n) return false;
		}
		return true;
	}
}
