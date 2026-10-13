package com.operations;

public class SinglyLinkedList implements List {
	
	public class Node{
		int data;
		Node next;
		
	}
	
	private Node head;
	private Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;
		
	}

	@Override
	public void addAtFront(int element) {
		Node newNode = new Node();
		newNode.data= element;
		newNode.next = head;
		head = newNode;
		if(tail==null) {
			tail=head;
		}
		
	}

	@Override
	public void addAtEnd(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFrontNode() {
		
		if(head==null) {
			return 0;
		}
		
		Node temp = head;
		head = head.next;
		
		if(head==null) {
			tail = null;
		}
		
		System.out.println("Deleted Front Node");
		return temp.data;
	}

	@Override
	public boolean deleteEndNode() {
	
		Node current = head;
		
	
		if(head==null) {
			return false;
		}
		if(head == tail) {
			
			head= null;
			tail = null;
			return true;
			
		}
		while(current.next!= tail) {
			current = current.next;
		}
		
		current.next = null;
		tail = current;
		
		return true;
		
		
	}
	@Override
	public void display() {
		Node current = head;
		int count = 1;
		while(current!=null) {
			System.out.println("Linked List "+ count+"  element:"+current.data);
			current = current.next;
			count++;
		}
	}

	@Override
	public boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}

	@Override
	public void delete(int element) {
		Node current = head;
		
		if(head == null) {
			return;
		}
		if(head.data==element) {
			head = head.next;
			return;
		}
		while(current!=null) {
			
			if(current.next.data==element) {
				current.next = current.next.next;
				break;
			}
			else if(current.next == null) {
				return;
			}
			current = current.next;
		}
		
	}

	@Override
	public boolean deleteAll(int element) {
		Node current = head;
		
		if(head == null) {
			return false;
		}
		
		while(current!=null) {
			if(head.data==element) {
				if(current == head) {
					head = head.next;
					current = head;
				}
			}
			if(current==tail) {
				return false;
			}
			
			if(current.next.data==element) {
				current.next = current.next.next;
			}
			
			current = current.next;
		}
		return false;
	}

	@Override
	public boolean search(int element) {
		Node current = head;
		
		
		while(current != null) {
			
			if(current.data == element) {
				return true;
				
			}
			current = current.next;
			
		}
		
		return false;
	}

	@Override
	public void printBackwards() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAtPosition(int position, int element) {
		// TODO Auto-generated method stub
		
	}

}
