package se.mosverkstad.mosjava.leetcode.aag.reverseInteger;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(321, solution.reverse(123));
	}
	
	public void testSolution02() {
		Assert.assertEquals(-321, solution.reverse(-123));
	}	
	
	public void testSolution03() {
		Assert.assertEquals(21, solution.reverse(120));
	}
	
	public void testSolution04() {
		Assert.assertEquals(0, solution.reverse(0));
	}
}
