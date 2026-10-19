
public class Program {
	public static void main(String [] args) {
//		int [] arr = {3,4,2,6,9,7,1,0,5,8};
//		Heap.heapSort(arr);
		
		Hash table = new HashTableUsingChaining();
		
		table.insert(4);
		table.insert(24);
		table.insert(9);
		table.insert(5);
		table.insert(7);
		table.insert(6);
		table.insert(14);
		table.insert(0);
		table.insert(3);
		table.insert(8);
		table.insert(2);
		table.insert(1);
		
		System.out.println(table.search(24));
	}
}
