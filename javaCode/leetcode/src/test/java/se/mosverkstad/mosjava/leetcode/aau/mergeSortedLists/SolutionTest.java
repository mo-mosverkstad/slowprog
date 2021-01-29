package se.mosverkstad.mosjava.leetcode.aau.mergeSortedLists;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		ListNode expect = ListNode.buildFromArray(new int[]{1,1,2,3,4,4});
		ListNode result = solution.mergeTwoLists(ListNode.buildFromArray(new int[]{1,2,4}),
				ListNode.buildFromArray(new int[]{1,3,4}));
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
	
	public void testSolution02() {
		ListNode expect = ListNode.buildFromArray(new int[]{});
		ListNode result = solution.mergeTwoLists(ListNode.buildFromArray(new int[]{}),
				ListNode.buildFromArray(new int[]{}));
		Assert.assertEquals(expect, result);
	}
	
	public void testSolution03() {
		ListNode expect = ListNode.buildFromArray(new int[]{0});
		ListNode result = solution.mergeTwoLists(ListNode.buildFromArray(new int[]{}),
				ListNode.buildFromArray(new int[]{0}));
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
}
