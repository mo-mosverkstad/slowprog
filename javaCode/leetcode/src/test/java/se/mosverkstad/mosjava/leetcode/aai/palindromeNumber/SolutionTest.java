package se.mosverkstad.mosjava.leetcode.aai.palindromeNumber;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(true, solution.isPalindrome(121));
	}
	
	public void testSolution02() {
		Assert.assertEquals(false, solution.isPalindrome(-121));
	}
	
	public void testSolution03() {
		Assert.assertEquals(false, solution.isPalindrome(10));
	}
	
	public void testSolution04() {
		Assert.assertEquals(true, solution.isPalindrome(12344321));
	}
	
	public void testSolution05() {
		Assert.assertEquals(false, solution.isPalindrome(1234421));
	}
}
