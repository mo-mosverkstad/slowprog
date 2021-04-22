package se.mosverkstad.mosjava.leetcode.zaa.binTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	private final String COMMA = ",";
	
	class TreeNode <T> {
		T node;
		TreeNode<T> left;
		TreeNode<T> right;
		TreeNode(T node) {
			this.node = node;
		}
	}
	
	String inorderTraverseBinTree(int[] array) {
		StringBuilder str = new StringBuilder();
		inorderTraverse(buildBinTree(array).get(0), str);
		str.setLength(Math.max(str.length() - 1, 0));
		return str.toString();
	}
	
	private List<TreeNode<Integer>> buildBinTree(int[] array) {
		if (array == null || array.length <= 0) return null;
		List<TreeNode<Integer>> arrayTree = new ArrayList<TreeNode<Integer>>();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			arrayTree.add(new TreeNode<Integer>(array[i]));
		}
		for (int i = 0, midLength = (length - 1) / 2; i <= midLength; i++) {
			arrayTree.get(i).left  = (i * 2 + 1 < length)? arrayTree.get(i * 2 + 1) : null;
			arrayTree.get(i).right = (i * 2 + 2 < length)? arrayTree.get(i * 2 + 2) : null;
		}
		return arrayTree;
	}
	
	private void inorderTraverse(TreeNode<Integer> treeNode, StringBuilder str) {
		if (treeNode == null) return;
		if (treeNode.left != null) inorderTraverse(treeNode.left, str);
		str.append(treeNode.node.toString()).append(COMMA);
		if (treeNode.right != null) inorderTraverse(treeNode.right, str);
	}
}
