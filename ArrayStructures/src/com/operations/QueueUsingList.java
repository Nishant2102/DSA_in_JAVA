package com.operations;

public class QueueUsingList extends SinglyLinkedList implements Queue {

	@Override
	public void enqueue(int element) throws Exception {
		addAtEnd(element);
	}

	@Override
	public int dequeue() throws Exception {
	    return deleteFrontNode();
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
		
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
