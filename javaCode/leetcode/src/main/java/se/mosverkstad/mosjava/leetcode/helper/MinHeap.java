package se.mosverkstad.mosjava.leetcode.helper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinHeap<E> {
	private List<Pointer<E>> array = new ArrayList<Pointer<E>>();
	private Comparator<E> comparator;
	public MinHeap(Comparator<E> comparator) {this.comparator = comparator;}
	
	public MinHeap<E> push(E element) {
		Pointer<E> pointer = new Pointer<E>(element);
		array.add(pointer);
		flowUp();
		return this;
	}
	
	public E peek() {
		return array.size() > 0? array.get(0).pointer:null;
	}
	
	public E popup() {
		E top = peek();
		if (array.size() > 0) {
			array.get(0).pointer = null;
			flowDown();
		}
		return top;
	}
	
	public void clear() {
		array.clear();
	}
	
	public int size() {
		return array.size();
	}
	
	private void flowUp() {
		int index = array.size() - 1;
		while (index > 0) {
			int father = (index - 1) / 2;
			if (comparator.compare(array.get(father).pointer, array.get(index).pointer) > 0) {
				swap(array.get(father), array.get(index));
				index = father;
			} else {
				break;
			}
		}
	}
	
	private void flowDown() {
		int index = 0, len = array.size();
		int leftChild = index * 2 + 1;
		while (leftChild <  len) {
			int rightChild = leftChild + 1;
			if (rightChild >= len) {
				swap(array.get(index), array.get(leftChild)); index = leftChild;
			} else {
				if (comparator.compare(array.get(leftChild).pointer, array.get(rightChild).pointer) < 0) {
					swap(array.get(index), array.get(leftChild)); index = leftChild;
				} else {
					swap(array.get(index), array.get(rightChild)); index = rightChild;
				}
			}
			leftChild = index * 2 + 1;
		}
		array.remove(index);
	}
	
	private void swap(Pointer<E> pointer1, Pointer<E> pointer2) {
		E obj1 = pointer1.pointer, obj2 = pointer2.pointer;
		pointer1.pointer = obj2;
		pointer2.pointer = obj1;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Pointer<E> pointer : array) {
			str.append(pointer.pointer.toString()).append(", ");
		}
		return str.toString();
	}
}
