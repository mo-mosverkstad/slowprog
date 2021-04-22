package se.mosverkstad.mosjava.leetcode.zaa.binTree;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		int[] array = new int[] {0,1,2,3,4,5,6,7};
		Assert.assertTrue("7,3,1,4,0,5,2,6".equals(solution.inorderTraverseBinTree(array)));
	}
	
	public void testSolution02() {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8};
		Assert.assertTrue("7,3,8,1,4,0,5,2,6".equals(solution.inorderTraverseBinTree(array)));
	}
	
	public void testSolution03() {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
		Assert.assertTrue("7,3,8,1,9,4,0,5,2,6".equals(solution.inorderTraverseBinTree(array)));
	}
	
	public void testSolution04() {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		Assert.assertTrue("7,3,8,1,9,4,10,0,5,2,6".equals(solution.inorderTraverseBinTree(array)));
	}
	
	public void testSolution05() {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9,10,11};
		Assert.assertTrue("7,3,8,1,9,4,10,0,11,5,2,6".equals(solution.inorderTraverseBinTree(array)));
	}
	
}
