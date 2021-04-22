package se.mosverkstad.mosjava.leetcode.zab.reversePolishNotation;

import junit.framework.TestCase;
import junit.framework.Assert;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();

	public void testSolution01() {
		Assert.assertTrue("abcd*-*e+".equals(solution.rpn("a*(b-c*d)+e")));
	}
	
	public void testSolution02() {
		Assert.assertTrue("123*+45/-6-78%+9-".equals(solution.rpn("1+2*3-4/5-6+7%8-9")));
	}
	
	public void testSolution03() {
		Assert.assertTrue("6523+8/+3+%".equals(solution.rpn("6%(5+(2+3)/8+3)")));
	}	
}
