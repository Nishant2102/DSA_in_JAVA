package com.operations;

public class CircularQueue implements Queue {
	
	private int [] arr;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	

	public CircularQueue() {
		capacity = 20;
		arr = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	@Override
	public void enqueue(int element) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		rear = (rear + 1) % capacity;
		arr[rear] = element;
		size++;

	}

	@Override
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp = arr[front];
		front = (front + 1) % capacity;
		size--;
		System.out.println("Deleted data: " + temp);
		return temp;
	}

	@Override
	public boolean isEmpty() {
		if(size==0) return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(size==capacity) return true;
		return false;
	}

	@Override
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		for(int i = 0; i<size; i++) {
			int index = (front+i) % capacity;
			System.out.println(arr[index]);
		}
		System.out.println(" ");
	}

}
