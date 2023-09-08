package com.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(1);
		queue.add(7);
		queue.add(4);
		queue.add(9);
		System.out.println(queue.peek());//gives the element which is at first
		System.out.println(queue.poll());
		System.out.println(queue.poll());//it will remove the element
		Deque<Integer> deque=new ArrayDeque<>();//insertion and deletion can be done at both sides
		deque.add(11);
		deque.addFirst(17);
		System.out.println(deque.peek());
		
		

	}

}
