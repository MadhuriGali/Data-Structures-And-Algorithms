package com.LinkedList;

public class ListNode {
	
	
	public int data;
	public ListNode next;
	public ListNode(int data) {
		this.data = data;
		this.next=null;
	}
	@Override
	public String toString() {
		return "ListNode [data=" + data + ", next=" + next + "]";
	}


}
