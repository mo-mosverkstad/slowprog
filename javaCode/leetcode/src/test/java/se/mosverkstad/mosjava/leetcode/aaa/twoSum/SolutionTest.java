package se.mosverkstad.mosjava.leetcode.aaa.twoSum;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;


public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue(Arrays.equals(new Integer[]{0, 1}, solution.twoSum(new Integer[]{2, 7, 11, 15}, 9)));
	}
	
	public void testSolution02() {
		Assert.assertTrue(Arrays.equals(new Integer[]{1, 2}, solution.twoSum(new Integer[]{3, 2, 4}, 6)));
	}
	
	public void testSolution03() {
		Assert.assertTrue(Arrays.equals(new Integer[]{0, 1}, solution.twoSum(new Integer[]{3, 3}, 6)));
	}

}
