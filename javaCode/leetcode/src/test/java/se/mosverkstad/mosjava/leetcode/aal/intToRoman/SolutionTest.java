package se.mosverkstad.mosjava.leetcode.aal.intToRoman;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		Assert.assertTrue("III".equals(solution.intToRoman(3)));
	}
	
	public void testSolution02() {
		Assert.assertTrue("IV".equals(solution.intToRoman(4)));
	}
	
	public void testSolution03() {
		Assert.assertTrue("IX".equals(solution.intToRoman(9)));
	}
	
	public void testSolution04() {
		Assert.assertTrue("LVIII".equals(solution.intToRoman(58)));
	}
	
	public void testSolution05() {
		Assert.assertTrue("MCMXCIV".equals(solution.intToRoman(1994)));
	}
	
}
