
public class Program {
	public static void main(String [] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
//		System.out.println(BubbleSort.isAscSorted(arr));
//		System.out.println(BubbleSort.isDescSorted(arr));
		
//		BubbleSort.descSort(arr);
//		InsertionSort.descSort(arr);
		QuickSort.descSort(arr,0,arr.length-1);
		
		for(int x: arr) {
			System.out.println(x);
		}
		
		
	}
}
