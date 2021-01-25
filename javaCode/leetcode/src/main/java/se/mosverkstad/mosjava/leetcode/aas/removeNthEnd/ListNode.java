package se.mosverkstad.mosjava.leetcode.aas.removeNthEnd;

public class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	
	private static final String COMMA = ", ";
	
	public static ListNode buildFromArray(int[] nums) {
		if (nums == null || nums.length == 0) return null;
		ListNode head = new ListNode(nums[0]);
		ListNode current = head;
		for (int i = 1, len = nums.length; i < len; i++) {
			ListNode node = new ListNode(nums[i]);
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
		ListNode current = this;
		while (current.next != null) {
			current = current.next;
			result.append(COMMA).append(current.val);
		}
		return result.toString();
	}
}
