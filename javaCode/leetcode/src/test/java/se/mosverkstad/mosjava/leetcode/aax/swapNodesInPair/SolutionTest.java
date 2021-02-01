package se.mosverkstad.mosjava.leetcode.aax.swapNodesInPair;

import junit.framework.Assert;
import junit.framework.TestCase;
import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue("2, 1, 4, 3".equals(solution.swapPairs(ListNode.buildIntegerListNodeFromArray(new int[]{1,2,3,4})).toString()));
	}

	public void testSolution02() {
		Assert.assertEquals(null, solution.swapPairs(ListNode.buildIntegerListNodeFromArray(new int[]{})));
	}
	
	public void testSolution03() {
		Assert.assertTrue("1".equals(solution.swapPairs(ListNode.buildIntegerListNodeFromArray(new int[]{1})).toString()));
	}
}
