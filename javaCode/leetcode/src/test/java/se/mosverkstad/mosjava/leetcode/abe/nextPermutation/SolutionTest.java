package se.mosverkstad.mosjava.leetcode.abe.nextPermutation;

import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		int[] nums = new int[]{1, 2, 3};
		solution.nextPermutation(nums);
		Assert.assertTrue(Arrays.equals(nums, new int[]{1, 3, 2}));
	}

	public void testSolution02() {
		int[] nums = new int[]{3, 2, 1};
		solution.nextPermutation(nums);
		Assert.assertTrue(Arrays.equals(nums, new int[]{1, 2, 3}));
	}
	
	public void testSolution03() {
		int[] nums = new int[]{1, 1, 5};
		solution.nextPermutation(nums);
		Assert.assertTrue(Arrays.equals(nums, new int[]{1, 5, 1}));
	}
	
	public void testSolution04() {
		int[] nums = new int[]{1};
		solution.nextPermutation(nums);
		Assert.assertTrue(Arrays.equals(nums, new int[]{1}));
	}
}
