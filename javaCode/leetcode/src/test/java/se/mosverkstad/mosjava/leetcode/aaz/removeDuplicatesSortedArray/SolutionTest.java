package se.mosverkstad.mosjava.leetcode.aaz.removeDuplicatesSortedArray;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		int [] nums = new int[]{1,1,2};
		int len = solution.removeDuplicates(nums);
		Assert.assertTrue(compareIntArrays(new int[]{1,2}, nums, len));
	}
	
	public void testSolution02() {
		int [] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		int len = solution.removeDuplicates(nums);
		Assert.assertTrue(compareIntArrays(new int[]{0,1,2,3,4}, nums, len));
	}
	
	private boolean compareIntArrays(int[] array1, int[] array2, int len) {
		if (array1.length != len) return false;
		for (int i = 0; i < len; i++) {
			if (array1[i] != array2[i]) return false;
		}
		return true;
	}
}
