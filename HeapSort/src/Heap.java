
public class Heap {	
	public static void swap(int [] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void makeMinHeap(int [] arr, int parent,int n) {
		int minChild=(2*parent)+1;
		int rightChild=(2*parent)+2;
		
		if(minChild>=n) return;
		
		int current=parent;
		
		if(arr[current]>arr[minChild]) {
			current=minChild;
		}
		
		if(rightChild<n) {
			if(arr[current]>arr[rightChild]) {
				current=rightChild;
			}
		}
				
		if(parent==current) return;
		
		swap(arr,parent,current);
		
		makeMinHeap(arr,current,n);
		
	}
	
	public static void buildMinHeap(int []arr,int size) {
		int lastParent=(size/2)-1;
		while(lastParent>=0) {
			makeMinHeap(arr,lastParent,size);
			lastParent--;
		}
	}
	
	public static void heapSort(int [] arr) {
		buildMinHeap(arr,arr.length);
		int lastNode=arr.length-1;
		
		while(lastNode>=0) {
			System.out.println(arr[0]);
			swap(arr,0,lastNode);
			if(lastNode>1) {
				makeMinHeap(arr,0,lastNode);
			}
			lastNode--;
		}
		
		
	}
	
}
