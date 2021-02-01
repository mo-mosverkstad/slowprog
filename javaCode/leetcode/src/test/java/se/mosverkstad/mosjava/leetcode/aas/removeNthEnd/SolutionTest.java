package se.mosverkstad.mosjava.leetcode.aas.removeNthEnd;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		ListNode<Integer> expect = ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,5});
		ListNode<Integer> result = solution.removeNthFromEnd(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,4,5}), 2);
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
	
	public void testSolution02() {
		ListNode<Integer> result = solution.removeNthFromEnd(ListNode.buildIntegerListNodeFromArray(new int[]{1}), 1);
		Assert.assertEquals(null, result);
	}
	
	public void testSolution03() {
		ListNode<Integer> expect = ListNode.buildIntegerListNodeFromArray(new int[]{1});
		ListNode<Integer> result = solution.removeNthFromEnd(ListNode.buildIntegerListNodeFromArray(new int[]{1,2}), 1);
		Assert.assertTrue(expect.toString().equals(result.toString()));
	}
}
