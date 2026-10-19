
public class LinkedList  {
	
	public class Node{
		int data;
		Node next;
		Node prev;
	}
	
	private Node head;
	private Node tail;
	


	public LinkedList() {
		
		head = null;
		tail = null;
	}

	public void addAtFront(int element) {
		Node newNode = new Node();
		newNode.data= element;
		newNode.prev = null;
		if(tail==null) {
			tail=head=newNode;
			return;
		}
		
		
		newNode.next = head;
		head.prev=newNode;
		
		head = newNode;                                                       
		
		
	}

	public void addAtEnd(int element) {
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		if(head==null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.prev = tail;
		
		tail.next = newNode;
		newNode.prev=tail;
		tail = newNode;
	}

	public int deleteFrontNode() {
		
		if(head==null) {
			return 0;
		}
		
		Node temp = head;
		head = head.next;
		head.prev = null;
		
		if(head==null) {
			tail = null;
		}
		
		System.out.println("Deleted Front Node");
		return temp.data;
	}

	public boolean deleteEndNode() {
	
		Node current = tail;
		
	
		if(head==null) {
			return false;
		}
		if(head == tail) {
			
			head= null;
			tail = null;
			return true;
			
		}
		
		tail = current.prev;
		tail.next = null;
		
		return true;
		
		
	}
	public void display() {
		Node current = head;
		int count = 1;
		while(current!=null) {
			System.out.println("Linked List "+ count+"  element:"+current.data);
			current = current.next;
			count++;
		}
	}

	public boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}

	public void delete(int element) {
		Node current = head;
		
		if(head == null) {
			return;
		}
		if(head.data==element) {
			head = head.next;
			head.prev = null;
			return;
		}
		while(current!=null) {
			
			if(current.data==element) {
				current.prev.next = current.next;
				current.next.prev = current.prev;
				
				break;
			}
			else if(current.next == null) {
				return;
			}
			current = current.next;
		}
		
	}

	public boolean deleteAll(int element) {
		Node current = head;
		
		if(head == null) {
			return false;
		}
		
		while(current!=null) {
			if(head.data==element) {
				if(current == head) {
					head = head.next;
					head.prev = null;
					current = head;
				}
				
			}
			
			
			if(tail.data==element) {
				if(current == tail) {
					tail = tail.prev;
					tail.next = null;
					current = tail;
				}
			}
			
			if(current.data==element) {
				
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}
			
			current = current.next;
		}
		return false;
	}

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

	public void printBackwards() {
		Node current = tail;
		if(tail == null) {
			return;
		}
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	public void addAtPosition(int position, int element) {
		
	}

}
