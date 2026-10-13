

public class ArrayCustom {
	int maxCount;
	int current;
	int [] arr = null;
	int [] arr1=null;
	
	ArrayCustom(){
		this.maxCount=10;
		this.current=0;
		this.arr = new int[maxCount];
		
	}
	
	public void add(int element) {
		if(current>=maxCount-1) {
			resize();
		}
		arr[current++]=element;
	}
	
	public void delete(int position) {
		for(int i=position+1;i<current-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[current-1]=-1;
	}
	
	
	public void insertAtPosition(int position, int value) {
		if(current+1>=maxCount) {
			add(-1);
		}
		for(int i=current-1;i>position;i--) {
			arr[i]=arr[i-1];
		}
		arr[position]=value;
	}
	
	private void resize() {
		arr1=new int[this.maxCount++];
		int tempCount=0;
		for(int x:arr) {
			arr1[tempCount++]=x;
		}
		arr=arr1;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[ ");
		for(int x: arr) {
			str.append(x);
			str.append(", ");
		}
		str.append(" ]");
		return str.toString();
	}
}
