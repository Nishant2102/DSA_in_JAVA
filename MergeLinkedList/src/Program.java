
public class Program {
	
	public static LinkedList merge(LinkedList l1, LinkedList l2) {
		
		LinkedList finalList = new LinkedList();
		Node head1=l1.getHead();
		Node head2=l2.getHead();
		
		Node current1= head1;
		Node current2=head2;
		
		
		while(current1!=null && current2!=null) {
			if(current1.data<current2.data) {
				finalList.insert(current1.data);
				current1=current1.next;
			}
			else {
				finalList.insert(current2.data);
				current2=current2.next;
			}
		}
		while(current1!=null || current2!=null) {
			if(current1!=null) {
				finalList.insert(current1.data);
				current1=current1.next;
			}
			else if(current2!=null) {
				finalList.insert(current2.data);
				current2=current2.next;
			}
		}
		
		return finalList;
	}
	
	public static void pairWise(LinkedList list) {
//		if (list == null || list.getHead() == null) {
//	        return;
//	    }
		Node head = list.getHead();
		Node current = head;
		Node newHead=current.next!=null?current.next:current;
		while(current !=null && current.next!=null) {
			Node newNode = current.next;
			Node newPair = newNode.next;
			
			newNode.next=current;
			newNode.prev=current.prev;
			
			current.prev=newNode;
			current.next=newPair;
			
			if(newNode.prev!=null) {
				newNode.prev.next=newNode;
			}
			if(newPair!=null) {
				newPair.prev=current;
			}
			current=newPair;
			
		}
		list.head=newHead;
	}
	
	public static void main(String [] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		list1.insert(4);
		list1.insert(3);
		list1.insert(27);
		list1.insert(2);
		list1.insert(9);
		list1.insert(1);
		
		list2.insert(5);
		list2.insert(16);
		list2.insert(81);
		list2.insert(0);
		
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+ list2);
		
		LinkedList finalList=merge(list1,list2);
		System.out.println("Merged List: "+ finalList);
		pairWise(finalList);
		System.out.println("Swapped List: "+finalList);
		
		
		DequeueUsingArray q = new DequeueUsingArray();
		
		q.addFront(8);
		q.addEnd(2);
		q.addFront(3);
		q.addEnd(6);
		q.addFront(1);
		q.addEnd(12);
		q.addFront(18);
		q.addEnd(23);
		
		q.deleteEnd();
		q.deleteFront();
		q.deleteEnd();
		
		System.out.println("Dequeue: "+q);
	}
}
