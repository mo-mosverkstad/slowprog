package se.mosverkstad.mosjava.leetcode.aac.longestSubstring;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
	}

	public void testSolution03() {
		Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
	}
	
	public void testSolution04() {
		Assert.assertEquals(10, solution.lengthOfLongestSubstring("pwabcwdefghiepabk"));
	}
}
