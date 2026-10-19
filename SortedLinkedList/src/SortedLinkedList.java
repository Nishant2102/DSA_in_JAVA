
public class SortedLinkedList {
	public class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data=data;
			prev=null;
			next=null;
		}
	}
	
	Node first;
	Node last;
	Node current;
	int size=0;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(first==null) {
			first=last=current=newNode;
		}
		
		if(newNode.data<=first.data) {
			newNode.next=first;
			first.prev=newNode;
			first=newNode;
		}
		else if(newNode.data>last.data) {
			newNode.prev=last;
			last.next=newNode;
			last=newNode;
		}
		else if(newNode.data>first.data && newNode.data<last.data){
			current=first;
			while(current!=null) {
				if(newNode.data<current.next.data) {
					newNode.prev=current;
					newNode.next=current.next;
					current.next.prev=newNode;
					current.next=newNode;
					
					break;
				}
				current=current.next;
			}
		}
		size++;
		
	}
	
	public SortedLinkedList merge(SortedLinkedList newList) {
		
		
		SortedLinkedList mergedList = new SortedLinkedList();
		Node p1 = this.first;
		Node p2 = newList.first;
		
		while(p1 != null && p2 != null) {
			if(p1.data > p2.data) {
				mergedList.first.data = p2.data;
			}
		}
		
		
		return mergedList;
		
//		if	(newList == null || newList.first==null) {
//			return;
//		}
//		
//		if(this.first == null) {
//			this.first = newList.first;
//			this.last = newList.last;
//			this.size = newList.size;
//			return;
//		}
//		
//		
//		Node p1 = this.first;
//		Node p2 = newList.first;
//		
//		Node newListFirst = null;
//		Node newListLast = null;
		
		
		
		
	}

	@Override
	public String toString() {
		current=first;
		StringBuffer str = new StringBuffer();
		str.append("[ ");
		while(current!=null) {
			str.append(current.data);
			str.append(" ");
			current=current.next;
		}
		str.append(" ]");
		return str.toString();
	}
	
	
	
}
