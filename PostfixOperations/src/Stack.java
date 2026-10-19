
public class Stack {
	private class Node{
		int data;
		private Node next;
		private Node prev;
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}
	
	int size=0;
	Node root=null;
	Node top=null;
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			root = top = newNode;
			return;
		}
		top.next=newNode;
		newNode.prev= top;
		top=newNode;
		size++;
	}
	
	public int pop() {
		if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
		int out=top.data;
		if(root==top) root=top=null;
		else {
			top=top.prev;
			top.next=null;
		}
		size--;
		return out;
	}
	
	public void peek() {
		if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
		System.out.println(top.data);
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	public int size() {
		return size;
	}
}
