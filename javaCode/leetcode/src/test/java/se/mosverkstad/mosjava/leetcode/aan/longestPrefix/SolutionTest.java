package se.mosverkstad.mosjava.leetcode.aan.longestPrefix;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue("fl".equals(solution.longestCommonPrefix(new String[]{"flower","flow","flight"})));
	}
	
	public void testSolution02() {
		Assert.assertTrue("".equals(solution.longestCommonPrefix(new String[]{"dog","racecar","car"})));
	}
	
	public void testSolution03() {
		Assert.assertTrue("dog".equals(solution.longestCommonPrefix(new String[]{"doggi","dog","dogshome"})));
	}
}
