package se.mosverkstad.mosjava.leetcode.aab.addTwoNumbers;

import java.util.Arrays;
import java.util.LinkedList;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {
	private Solution solution = new Solution();
	
	public void testSolution01() {
		Assert.assertTrue(Comparator.compareLinkedList(new LinkedList<Integer>(Arrays.asList(7, 0, 8)),
				solution.addTwoNumbers(new LinkedList<Integer>(Arrays.asList(2, 4, 3)),
						new LinkedList<Integer>(Arrays.asList(5, 6, 4)))
				));
	}

	public void testSolution02() {
		Assert.assertTrue(Comparator.compareLinkedList(new LinkedList<Integer>(Arrays.asList(0)),
				solution.addTwoNumbers(new LinkedList<Integer>(Arrays.asList(0)),
						new LinkedList<Integer>(Arrays.asList(0)))
				));
	}
	
	public void testSolution03() {
		Assert.assertTrue(Comparator.compareLinkedList(new LinkedList<Integer>(Arrays.asList(8,9,9,9,0,0,0,1)),
				solution.addTwoNumbers(new LinkedList<Integer>(Arrays.asList(9,9,9,9,9,9,9)),
						new LinkedList<Integer>(Arrays.asList(9,9,9,9)))
				));
	}
	
}
