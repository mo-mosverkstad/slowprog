package se.mosverkstad.mosjava.leetcode.aah.atoi;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(42, solution.myAtoi("42"));
	}

	public void testSolution02() {
		Assert.assertEquals(-42, solution.myAtoi("   -42"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
	}
	
	public void testSolution04() {
		Assert.assertEquals(0, solution.myAtoi("words and 987"));
	}
	
	public void testSolution05() {
		Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
	}
}
