package com.operations;

public class FixedStack implements Stack{
	
	int [] arr1;
	int [] arr2;
	int top;
	
	public FixedStack (int n) {
		arr1 = new int [n];
		top = -1;
	}
	
	@Override
	public void push(int element) throws Exception {
	
		if(isFull()) {
			arr2 = new int[arr1.length+1];
			for(int i=0;i<arr1.length;i++) {
				arr2[i] = arr1[i];
			}
			arr1 = arr2;
		}
		arr1[++top]=element;
		
		
	}

	@Override
	public int pop() throws Exception {
		if(isEmpty()) throw new Exception();
		int result = arr1[top--];
		return result;
	}

	@Override
	public int peek() {
		return arr1[top];
	}

	@Override
	public boolean isEmpty() {
		if(top ==-1) return true;
		return false;
	}

	@Override
	public void display() {
		for(int x: arr1) {
			System.out.println(x);
		}
	}

	@Override
	public boolean isFull() {
		if(top == (arr1.length-1))
		{
			return true;
		}
		return false;
	}

	
	
	
}
