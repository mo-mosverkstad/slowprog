package se.mosverkstad.mosjava.leetcode.aat.validParentheses;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(true, solution.isValid("()"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(true, solution.isValid("()[]{}"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(false, solution.isValid("(]"));
	}
	
	public void testSolution04() {
		Assert.assertEquals(false, solution.isValid("([)]"));
	}
	
	public void testSolution05() {
		Assert.assertEquals(true, solution.isValid("{[]}"));
	}
}
