package se.mosverkstad.mosjava.leetcode.aam.romanToInt;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(3, solution.romanToInt("III"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(4, solution.romanToInt("IV"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(9, solution.romanToInt("IX"));
	}
	
	public void testSolution04() {
		Assert.assertEquals(58, solution.romanToInt("LVIII"));
	}
	
	public void testSolution05() {
		Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
	}
}
