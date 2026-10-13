package com.operations;

public class CircularDoublyList implements List {
	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int e) {
			data = e;
			next = null;
			prev = null;
		}
	}

	private Node head;
	
	public CircularDoublyList() {
		head = new Node(0);
		head.next = head;
		head.prev = head;
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node(element);

		Node current = head.next;

		newNode.next = current;
		newNode.prev = current.prev;
		current.prev.next = newNode;
		current.prev = newNode;
	}

	@Override
	public void addAtEnd(int element) {
		Node newNode = new Node(element);

		Node current = head;

		newNode.next = current;
		newNode.prev = current.prev;
		current.prev.next = newNode;
		current.prev = newNode;
	}

	@Override
	public void addAtPosition(int position, int element) {
		Node newNode = new Node(element);

		int i = 0;
		Node current = head.next;
		while (current != head) {
			if (i == position) {
				break;
			}

			i = i + 1;
			current = current.next;
		}

		newNode.next = current;
		newNode.prev = current.prev;
		current.prev.next = newNode;
		current.prev = newNode;
	}

	@Override
	public void delete(int element) {
		Node current = head.next;
		
		while(current.next!=head && current.data!=element) {
			current=current.next;
		}
		
		if(current==head && head.data!=element) {
			return;
		}
		else if(current==head && head.data==element) {
			head=null;
			head.next=null;
			head.prev=null;
			return;
		}
		
		current.prev.next = current.next;
		current.next.prev = current.prev;

	}

	@Override
	public boolean deleteAll(int element) {
		Node current = head.next;
		
		if(head.next==head && head.data==element) {
			head=null;
			return true;
		}
		else if(head.next==head && head.data!=element) {
			return false;
		}
		
		
		while(current != head) {
			
			if(head.data==element && head.next!=head) {
				head.prev.next=head.next;
				head.next.prev=head.prev;
				if(current==head) {
					current=head.next;
				}
				head=head.next;
			}
			
			if(current.data==element) {
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}
			current=current.next;
		}
		return true;
	}

	@Override
	public boolean search(int element) {
		Node current =head.next;
		if(head.data==element) return true;
		while(current!=head) {
			if(current.data==element) return true;
			current=current.next;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}

	@Override
	public void display() {
		System.out.println("Forward traversal of circular doubly list ...");
		Node current = head.next;
		while (current != head) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}

	@Override
	public void printBackwards() {
		System.out.println("Backward traversal of circular doubly list ...");
		Node current = head.prev;
		while (current != head) {
			System.out.print(current.data + " ");
			current = current.prev;
		}
		System.out.println("");
	}

	@Override
	public int deleteFrontNode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteEndNode() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
