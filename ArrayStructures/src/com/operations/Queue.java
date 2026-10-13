package com.operations;

public interface Queue {
	void enqueue(int element) throws Exception;
	int dequeue() throws Exception;
	boolean isEmpty();
	boolean isFull();	
	void display();
}
