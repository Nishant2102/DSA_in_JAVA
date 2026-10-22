

public class DequeueUsingArray {
	int MAX=10;
	int current=0;
	int [] arr;
	
	DequeueUsingArray(){
		arr=new int[MAX];
	}
	
	public void resize() {
		int [] newArr = new int[2*MAX];
		MAX=2*MAX;
		current=0;
		for(int x: arr) {
			newArr[current++]=x;
		}
		arr=newArr;
	}
	
	public void insert(int data, int index) {
		if(current<MAX) {
			current++;
			if(current>=MAX) {
				resize();
			}
			for(int i=current-1;i>=index;i--) {
				arr[i+1]=arr[i];
			}
			arr[index]=data;
		}
		else {
			resize();
			insert(data,index);
		}
	}
	
	public void addFront(int data) {
		insert(data,0);
	}
	public void addEnd(int data) {
		insert(data,current);
	}
	
	public void deleteFront() {
		for(int i=0;i<current;i++) {
			arr[i]=arr[i+1];
		}
		arr[--current]=-1;
	}
	public void deleteEnd() {
		arr[--current]=-1;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[ ");
		for(int i=0;i<current;i++) {
			str.append(arr[i]+" ");
		}
		str.append(" ]");
		return str.toString();
	}
	
	
}
