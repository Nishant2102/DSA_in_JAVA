
public class InsertionSort {
	public static void descSort(int [] arr) {
		int sortedSize = 1;
		int size = arr.length;
		while(sortedSize<size) {
			int element = arr[sortedSize];
			int i = sortedSize - 1;
			while(i>=0) {
				if(arr[i] < element) {
					arr[i + 1] =  arr[i];
				}
				i--;
				
			}
			arr[i+ 1] = element;
			sortedSize++;
		}
	}
}
