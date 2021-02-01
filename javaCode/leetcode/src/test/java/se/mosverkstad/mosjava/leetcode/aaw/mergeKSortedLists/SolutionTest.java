package se.mosverkstad.mosjava.leetcode.aaw.mergeKSortedLists;


import junit.framework.Assert;
import junit.framework.TestCase;
import se.mosverkstad.mosjava.leetcode.helper.ListNode;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	@SuppressWarnings({ "unchecked" })
	public void testSolution01() {
		String expect = "1, 1, 2, 3, 4, 4, 5, 6";
		String result = solution.mergeKLists(new ListNode[]{
				ListNode.buildIntegerListNodeFromArray(new int[]{1,4,5}),
				ListNode.buildIntegerListNodeFromArray(new int[]{1,3,4}),
				ListNode.buildIntegerListNodeFromArray(new int[]{2,6})
				}).toString();
		Assert.assertTrue(expect.equals(result));
	}
	
	@SuppressWarnings("unchecked")
	public void testSolution02() {
		ListNode<Integer> result = solution.mergeKLists(new ListNode[]{});
		Assert.assertEquals(null, result);
	}
	
	@SuppressWarnings({ "unchecked" })
	public void testSolution03() {
		ListNode<Integer> result = solution.mergeKLists(new ListNode[]{
				ListNode.buildIntegerListNodeFromArray(new int[]{})
				});
		Assert.assertEquals(null, result);
	}
}
