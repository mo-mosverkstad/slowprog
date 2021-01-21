package se.mosverkstad.mosjava.leetcode.aad.findMedianSortedArrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(0.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
	}
}
