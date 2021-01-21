package se.mosverkstad.mosjava.leetcode.aab.addTwoNumbers;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
	
	public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;
		LinkedList<Integer> result = new LinkedList<Integer>();
		Iterator<Integer> it1 = list1.iterator();
		Iterator<Integer> it2 = list2.iterator();
		Integer carry = 0;
		while (it1.hasNext() || it2.hasNext()) {
			Integer op1 = it1.hasNext()? it1.next():0;
			Integer op2 = it2.hasNext()? it2.next():0;
			Integer sum = op1 + op2 + carry;
			result.add(sum % 10);
			carry = sum / 10;
		}
		if (carry.equals(1)) result.add(1);
		return result;
	}
	
}
