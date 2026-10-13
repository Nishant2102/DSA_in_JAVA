package com.operations;

public class FixedQueue implements Queue{
	
	int arr[];
	int front;
	int rear;
	
	FixedQueue(int n){
		arr = new int[n];
		front=-1;
		rear=-1;
	}
	@Override
	public void enqueue(int element) throws Exception {
		if(isFull()) throw new Exception("Queue is full!");
		arr[++rear]=element;
	}


	@Override
	public int dequeue() throws Exception{
		if(isEmpty()) throw new Exception("Queue is Empty!");
		
		return arr[rear--];
	}

	@Override
	public boolean isEmpty() {
		if(rear==front) return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear==arr.length-1) return true;
		return false;
	}
	@Override
	public void display() {
		for(int i: arr) {
			System.out.println(i);
		}
		
		
	}
	
}
