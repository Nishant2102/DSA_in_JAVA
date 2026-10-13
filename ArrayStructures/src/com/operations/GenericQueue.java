package com.operations;

public interface GenericQueue<T> {
	void enqueue(T element) throws Exception;
	T dequeue() throws Exception;
	boolean isEmpty();
	boolean isFull();	
	void display();
}
