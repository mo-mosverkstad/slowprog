package se.mosverkstad.mosjava.leetcode.aaf.zigzagConvert;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertEquals("PAHNAPLSIIGYIR",solution.convert("PAYPALISHIRING", 3));
	}

	public void testSolution02() {
		Assert.assertEquals("PINALSIGYAHRPI",solution.convert("PAYPALISHIRING", 4));
	}

	public void testSolution03() {
		Assert.assertEquals("A",solution.convert("A", 1));
	}

}
