
public class HashTableUsingChaining implements Hash {
	int size;
	LinkedList [] buckets;
	HashTableUsingChaining(){
		size=10;
		buckets=new LinkedList[size];
		for(int i=0;i<size;i++) {
			buckets[i]=new LinkedList();
		}
	}
	
	public int  modN(int key) {
		return (key%size);
	}
	
	@Override
	public void insert(int key) {
		buckets[modN(key)].addAtEnd(key);
	}

	@Override
	public boolean search(int key) {
	
		return (buckets[modN(key)].search(key));
	}

}
