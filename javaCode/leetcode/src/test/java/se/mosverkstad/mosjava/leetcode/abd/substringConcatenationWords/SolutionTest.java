package se.mosverkstad.mosjava.leetcode.abd.substringConcatenationWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		List<Integer> expect = new ArrayList<Integer>(Arrays.asList(0, 9));
		List<Integer> result = solution.findSubstring("barfoothefoobarman", new String[]{"foo","bar"});
		Assert.assertTrue(compareIntegerList(expect, result));
	}
	
	public void testSolution02() {
		List<Integer> expect = new ArrayList<Integer>();
		List<Integer> result = solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"});
		Assert.assertTrue(compareIntegerList(expect, result));
	}
	
	public void testSolution03() {
		List<Integer> expect = new ArrayList<Integer>(Arrays.asList(6,9,12));
		List<Integer> result = solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"});
		Assert.assertTrue(compareIntegerList(expect, result));
	}
	
	private boolean compareIntegerList(List<Integer> list1, List<Integer> list2) {
		if (list1.size() != list2.size()) return false;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) != list2.get(i)) return false;
		}
		return true;
	}
}
