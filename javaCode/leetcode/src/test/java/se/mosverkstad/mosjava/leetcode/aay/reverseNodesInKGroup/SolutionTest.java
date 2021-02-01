package se.mosverkstad.mosjava.leetcode.aay.reverseNodesInKGroup;

import se.mosverkstad.mosjava.leetcode.helper.ListNode;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue("2, 1, 4, 3, 5".equals(
				solution.reverseKGroup(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,4,5}), 2).toString()));
	}
	
	public void testSolution02() {
		Assert.assertTrue("3, 2, 1, 4, 5".equals(
				solution.reverseKGroup(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,4,5}), 3).toString()));
	}
	
	public void testSolution03() {
		Assert.assertTrue("1, 2, 3, 4, 5".equals(
				solution.reverseKGroup(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,4,5}), 1).toString()));
	}
	
	public void testSolution04() {
		Assert.assertTrue("1".equals(
				solution.reverseKGroup(ListNode.buildIntegerListNodeFromArray(new int[]{1}), 1).toString()));
	}
}
