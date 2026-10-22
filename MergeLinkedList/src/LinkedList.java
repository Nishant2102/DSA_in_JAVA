
public class LinkedList {
	
	
	Node head;
	Node current;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=current=newNode;
			return;
		}
		current=head;
		
		if(current.data<data) {
			while(current.next!=null && current.data<data) {
				current=current.next;
			}
			if(current.next==null) {
				current.next=newNode;
				newNode.prev=current;
			}
			else {
				newNode.next=current;
				newNode.prev=current.prev;
				current.prev.next=newNode;
				current.prev=newNode;
			}
			
		}
		else {
			current.prev=newNode;
			newNode.next=current;
			head=newNode;
		}
		
	}
	
	public Node getHead() {
		return head;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[ ");
		current=head;
		while(current!=null) {
			str.append(current.data + " ");
			current=current.next;
		}
		str.append(" ]");
		
		return str.toString()
;	}
	
	
	
}
