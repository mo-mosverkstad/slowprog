package se.mosverkstad.mosjava.leetcode.helper;

public class ListNode<E> {
	public E val;
	public ListNode<E> next;
	public ListNode() {}
	public ListNode(E val) { this.val = val; }
	public ListNode(E val, ListNode<E> next) { this.val = val; this.next = next; }
	
	private static final String COMMA = ", ";
	
	public static ListNode<Integer> buildIntegerListNodeFromArray(int[] nums) {
		if (nums == null || nums.length == 0) return null;
		ListNode<Integer> head = new ListNode<Integer>(nums[0]);
		ListNode<Integer> current = head;
		for (int i = 1, len = nums.length; i < len; i++) {
			ListNode<Integer> node = new ListNode<Integer>(nums[i]);
			current.next = node;
			current = node;
		}
		current.next = null;
		return head;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(this.val);
		ListNode<E> current = this;
		while (current.next != null) {
			current = current.next;
			result.append(COMMA).append(current.val);
		}
		return result.toString();
	}
}
