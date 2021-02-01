package se.mosverkstad.mosjava.leetcode.aau.mergeSortedLists;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		ListNode<Integer> expect = ListNode.buildIntegerListNodeFromArray(new int[]{1,1,2,3,4,4});
		ListNode<Integer> result = solution.mergeTwoLists(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,4}),
				ListNode.buildIntegerListNodeFromArray(new int[]{1,3,4}));
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
	
	public void testSolution02() {
		ListNode<Integer> expect = ListNode.buildIntegerListNodeFromArray(new int[]{});
		ListNode<Integer> result = solution.mergeTwoLists(ListNode.buildIntegerListNodeFromArray(new int[]{}),
				ListNode.buildIntegerListNodeFromArray(new int[]{}));
		Assert.assertEquals(expect, result);
	}
	
	public void testSolution03() {
		ListNode<Integer> expect = ListNode.buildIntegerListNodeFromArray(new int[]{0});
		ListNode<Integer> result = solution.mergeTwoLists(ListNode.buildIntegerListNodeFromArray(new int[]{}),
				ListNode.buildIntegerListNodeFromArray(new int[]{0}));
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
}
