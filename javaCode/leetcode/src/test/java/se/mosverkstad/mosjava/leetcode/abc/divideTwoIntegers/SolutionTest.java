package se.mosverkstad.mosjava.leetcode.abc.divideTwoIntegers;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(3, solution.divide(10, 3));
	}

	public void testSolution02() {
		Assert.assertEquals(-2, solution.divide(7, -3));
	}
	
	public void testSolution03() {
		Assert.assertEquals(0, solution.divide(0, 1));
	}
	
	public void testSolution04() {
		Assert.assertEquals(1, solution.divide(1, 1));
	}
}
