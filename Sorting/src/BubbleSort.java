
public class BubbleSort {
	public static void descSort(int [] arr) {
		int start;
		int size=arr.length;
		while(size>1) {
			start=0;
			while(start<size-1) {
				if(arr[start]<arr[start+1]) {
					int temp=arr[start];
					arr[start]=arr[start+1];
					arr[start+1]=temp;
				}
				else {
					start++;
				}
			}
			size--;
		}
	}
	
	public static boolean isDescSorted(int [] arr) {
		int start;
		int size=arr.length;
		int swapCount=0;
		while(size>1) {
			start=0;
			while(start<size-1) {
				if(arr[start]<arr[start+1]) {
					int temp=arr[start];
					arr[start]=arr[start+1];
					arr[start+1]=temp;
					swapCount++;
				}
				else {
					start++;
				}
			}
			size--;
		}
		return swapCount==0?true:false;
	}
	
	public static boolean isAscSorted(int [] arr) {
		int start;
		int size=arr.length;
		int swapCount=0;
		while(size>1) {
			start=0;
			while(start<size-1) {
				if(arr[start]>arr[start+1]) {
					int temp=arr[start];
					arr[start]=arr[start+1];
					arr[start+1]=temp;
					swapCount++;
				}
				else {
					start++;
				}
			}
			size--;
		}
		return swapCount==0?true:false;
	}
}
