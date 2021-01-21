package se.mosverkstad.mosjava.leetcode.aae.longestPalindrome;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue("bab".equals(solution.longestPalindrome("babad")));
	}
	
	public void testSolution02() {
		Assert.assertTrue("bb".equals(solution.longestPalindrome("cbbd")));
	}
	
	public void testSolution03() {
		Assert.assertTrue("a".equals(solution.longestPalindrome("a")));
	}
	
	public void testSolution04() {
		Assert.assertTrue("a".equals(solution.longestPalindrome("ac")));
	}
	
}
