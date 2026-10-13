package com.operations;

public class Program {
	
	public static int deletePosition(int arr[],int n, int position) {
		for(int i = position; i<n; i++) {
			arr[i-1] = arr[i];
		}
		return n-1;
	}

	public static void main(String[] args) throws Exception {
		/*
		//Delete Array
		
		int [] arr = {1,2,3,4,5,6,7,8,9,0} ;
		int size = arr.length;
		int position = 3;
		size = deletePosition(arr,size,position);
		for(int i =0; i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		// Stack
		
		Stack stack = new FixedStack(3);
		try {
			System.out.println(stack.isEmpty());
			stack.push(5);
			stack.push(2);
			stack.push(7);
			stack.push(9);
			System.out.println(stack.isFull());
			int popped=stack.pop();
			System.out.println(stack.peek() + " || "+popped);
			
			stack.display();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Queue
		
		Queue queue = new FixedQueue(3);
		try {
			System.out.println(queue.isEmpty());
			queue.enqueue(2);
			System.out.println(queue.isFull());
			queue.enqueue(3);
			queue.enqueue(4);
			queue.dequeue();
			queue.display();
			System.out.println(queue.isFull());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//GenericQueue
		
		GenericQueue<Integer> gqueue = new FixedGenericQueue<Integer>(3);
		try {
			System.out.println(gqueue.isEmpty());
			gqueue.enqueue(2);
			System.out.println(gqueue.isFull());
			gqueue.enqueue(3);
			gqueue.enqueue(4);
//			gqueue.enqueue(6);
			gqueue.display();
			System.out.println(gqueue.isFull());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
		
		*/
 		/*
		List list = new SinglyLinkedList();
		list.addAtFront(3);
		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(3);

		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(3);

		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(23);
//		list.deleteFrontNode();
//		list.deleteEndNode();
		list.deleteAll(3);
		System.out.println(list.search(25));
		list.display();
		*/
		
		//Queue Using Linked List
		/*
		Queue queue = new QueueUsingList();
		queue.enqueue(21);
		queue.enqueue(32);
		queue.enqueue(36);
		queue.enqueue(34);
		queue.enqueue(33);
		queue.dequeue();
		queue.dequeue();
		queue.display();
		*/
		
		//Circular Queue
		
//		Queue cirQueue = new CircularQueue();
//		cirQueue.enqueue(32);
//		cirQueue.enqueue(21);
//		cirQueue.enqueue(44);
//		cirQueue.dequeue();
//		cirQueue.display();
		
		//Doubly LInked List
		List list = new CircularDoublyList();
		
		list.addAtFront(3);
		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(3);

		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(3);

		list.addAtFront(10);
		list.addAtEnd(50);
		list.addAtEnd(48);
		list.addAtFront(23);
//		list.deleteFrontNode();
//		list.deleteEndNode();
		list.display();
		list.deleteAll(48);
		System.out.println(list.search(50));
		list.display();
	
	}

}
