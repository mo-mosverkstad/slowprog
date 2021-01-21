package se.mosverkstad.mosjava.leetcode.aaj.regularExpression;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(false, solution.isMatch("aa", "a"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(true, solution.isMatch("aa", "a*"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(true, solution.isMatch("ab", ".*"));
	}
	
	public void testSolution04() {
		Assert.assertEquals(true, solution.isMatch("aab", "c*a*b"));
	}
	
	public void testSolution05() {
		Assert.assertEquals(false, solution.isMatch("mississippi", "mis*is*p*."));
	}
}
