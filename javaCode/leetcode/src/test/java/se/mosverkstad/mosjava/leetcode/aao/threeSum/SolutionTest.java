package se.mosverkstad.mosjava.leetcode.aao.threeSum;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	@SuppressWarnings("serial")
	public void testSolution01() {
		List<List<Integer>> listExpect = new ArrayList<List<Integer>>(){
			{
				add(new ArrayList<Integer>(Arrays.asList(-1,-1,2)));
				add(new ArrayList<Integer>(Arrays.asList(-1, 0,1)));
			
			}
		};
		List<List<Integer>> listResult = solution.threeSum(new int[]{-1,0,1,2,-1,-4});
		Assert.assertTrue(compareTwoDimensionList(listExpect, listResult));
	}
	
	public void testSolution02() {
		List<List<Integer>> listExpect = new ArrayList<List<Integer>>();
		List<List<Integer>> listResult = solution.threeSum(new int[]{});
		Assert.assertTrue(compareTwoDimensionList(listExpect, listResult));
	}
	
	public void testSolution03() {
		List<List<Integer>> listExpect = new ArrayList<List<Integer>>();
		List<List<Integer>> listResult = solution.threeSum(new int[]{0});
		Assert.assertTrue(compareTwoDimensionList(listExpect, listResult));
	}
	
	private boolean compareTwoDimensionList(List<List<Integer>> list1, List<List<Integer>> list2) {
		if (list1 == null || list2 == null || list1.size() != list2.size()) return false;
		Iterator<List<Integer>> it1 = list1.iterator();
		Iterator<List<Integer>> it2 = list2.iterator();
		while (it1.hasNext()) {
			if (!it1.next().equals(it2.next())) return false;
		}
		return true;
	}
}
