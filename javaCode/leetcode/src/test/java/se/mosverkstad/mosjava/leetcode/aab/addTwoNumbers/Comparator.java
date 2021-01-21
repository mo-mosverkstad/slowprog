package se.mosverkstad.mosjava.leetcode.aab.addTwoNumbers;

import java.util.Iterator;
import java.util.LinkedList;

public class Comparator {
	public static boolean compareLinkedList(LinkedList<?> list1, LinkedList<?> list2) {
		if (list1 == null && list2 == null) return true;
		if (list1 == null && list2 != null) return false;
		if (list1 != null && list2 == null) return false;
		if (list1.size() != list2.size()) return false;
		
		Iterator<?> it1 = list1.iterator();
		Iterator<?> it2 = list2.iterator();
		while (it1.hasNext()) {
			if (!it1.next().equals(it2.next())) return false;
		}
		return true;
	}
}
