package se.mosverkstad.mosjava.leetcode.aap.threeSumClosest;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals(2, solution.threeSumClosest(new int[]{-1,2,1,-4}, 1));
	}
}
