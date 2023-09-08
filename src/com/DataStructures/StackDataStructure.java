package com.DataStructures;

import java.util.Stack;

public class StackDataStructure {

	protected int[] arr;
	int ptr = -1;
	
	public static final int Default_Size = 10;

	public StackDataStructure() {
		this(Default_Size);
	}

	public StackDataStructure(int size) {
		arr = new int[size];
	}

	public boolean push(int item) throws Exception {
		if (isFull()) {
			System.out.println("stack is full");
			return false;
		}

		ptr++;
		arr[ptr] = item;

		return true;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("array is empty");
		} else {
			int removed = arr[ptr];
			ptr--;
			return removed;
		}
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("array is empty");
		} 
		return arr[ptr];
	}

	public boolean isEmpty() {
		if (ptr < 0) {
			return true;

		}
		return false;
	}

	public boolean isFull() {
		if (ptr == arr.length) {
			return true;

		}
		return false;
	}

	private static void stackJavaImplementation() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(7);
		stack.push(4);
		stack.push(8);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
