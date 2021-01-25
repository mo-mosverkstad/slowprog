package se.mosverkstad.mosjava.leetcode.aaq.letterCombiPhone;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue(solution.letterCombinations("23").equals(new ArrayList<String>(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"))));
	}
	
	public void testSolution02() {
		Assert.assertTrue(solution.letterCombinations("").equals(new ArrayList<String>()));
	}
	
	public void testSolution03() {
		Assert.assertTrue(solution.letterCombinations("2").equals(new ArrayList<String>(Arrays.asList("a","b","c"))));
	}
}
