package com.DataStructures;

public class StackImplementation {

	public static void main(String[] args) throws Exception {
		StackDataStructure data=new StackDataStructure();
		data.push(1);
		data.push(2);
		data.push(3);
		System.out.println(data.peek());
		data.pop();
		System.out.println(data.peek());
		//System.out.println(data.pop());
		//System.out.println(data.pop());

	}

}
