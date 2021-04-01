package se.mosverkstad.mosjava.leetcode.abf.longestValidParentheses;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(2, solution.longestValidParentheses("(()"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(4, solution.longestValidParentheses(")()())"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(0, solution.longestValidParentheses(""));
	}
}
