package com.operations;

public interface Stack {
	void push(int element)throws Exception;
	int pop() throws Exception;
	int peek();
	boolean isEmpty();
	boolean isFull();
	void display();
}
