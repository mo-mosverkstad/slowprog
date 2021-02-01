package se.mosverkstad.mosjava.leetcode.aba.removeElement;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		int[] nums = new int[]{3,2,2,3};
		int len = solution.removeElement(nums, 3);
		Assert.assertTrue(compareIntArrays(new int[]{2,2}, nums, len));
	}
	
	public void testSolution02() {
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		int len = solution.removeElement(nums, 2);
		Assert.assertTrue(compareIntArrays(new int[]{0,1,3,0,4}, nums, len));
	}
	
	private boolean compareIntArrays(int[] array1, int[] array2, int len) {
		if (array1.length != len) return false;
		for (int i = 0; i < len; i++) {
			if (array1[i] != array2[i]) return false;
		}
		return true;
	}
}
