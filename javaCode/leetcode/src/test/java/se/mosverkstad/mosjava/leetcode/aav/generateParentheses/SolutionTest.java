package se.mosverkstad.mosjava.leetcode.aav.generateParentheses;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		List<String> expect = new ArrayList<String>(Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
		Assert.assertTrue(compareStringLists(expect, solution.generateParenthesis(3)));
	}
	
	public void testSolution02() {
		List<String> expect = new ArrayList<String>(Arrays.asList("()"));
		Assert.assertTrue(compareStringLists(expect, solution.generateParenthesis(1)));
	}
	
	private boolean compareStringLists(List<String> list1, List<String> list2) {
		if (list1.size() != list2.size()) return false;
		for (int i = 0, len = list1.size(); i < len; i ++) {
			if (!list1.get(i).equals(list2.get(i))) return false;
		}
		return true;
	}
}
