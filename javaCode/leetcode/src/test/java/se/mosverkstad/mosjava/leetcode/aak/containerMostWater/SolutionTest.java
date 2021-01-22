package se.mosverkstad.mosjava.leetcode.aak.containerMostWater;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
	}
	
	public void testSolution02() {
		Assert.assertEquals(1, solution.maxArea(new int[]{1,1}));
	}
	
	public void testSolution03() {
		Assert.assertEquals(16, solution.maxArea(new int[]{4,3,2,1,4}));
	}
	
	public void testSolution04() {
		Assert.assertEquals(2, solution.maxArea(new int[]{1,2,1}));
	}
}
