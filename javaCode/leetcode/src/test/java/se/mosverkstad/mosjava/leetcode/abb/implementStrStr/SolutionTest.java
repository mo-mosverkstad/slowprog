package se.mosverkstad.mosjava.leetcode.abb.implementStrStr;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(2, solution.strStr("hello", "ll"));
	}
	
	public void testSolution02() {
		Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"));
	}
	
	public void testSolution03() {
		Assert.assertEquals(0, solution.strStr("", ""));
	}
}
