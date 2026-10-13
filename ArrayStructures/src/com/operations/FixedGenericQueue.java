package com.operations;

public class FixedGenericQueue<T> implements GenericQueue<T> {
	T [] arr=null;
	int front;
	int rear;
	
	@SuppressWarnings("unchecked")
	FixedGenericQueue(int n){
		arr = (T[]) new Object[n];
		front=-1;
		rear=-1;
	}
	@Override
	public void enqueue(T element) throws Exception {
		if(isFull()) throw new Exception("Queue is full!");
		arr[++rear]=element;
	}


	@Override
	public T dequeue() throws Exception{
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
		for(T i: arr) {
			System.out.println(i);
		}
		
		
	}
}
