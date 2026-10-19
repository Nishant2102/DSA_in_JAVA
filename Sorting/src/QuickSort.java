
public class QuickSort {
	public static void descSort(int [] arr,int start, int end) {
		if(start>=end) return ;		
		int pivot=partition(arr,start,end);
		descSort(arr,start,pivot-1);
		descSort(arr,pivot+1,end);
	}
	
	public static int partition(int [] arr, int start, int end) {
		int pivot=start;
		int left=start+1;
		int right=end;
		while(left<=right) {
			while(left<=right && (arr[left]>=arr[pivot])) {
				left++;
			}
			while(left<=right && (arr[pivot]>arr[right])) {
				right--;
			}
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			
		}
		
		int temp=arr[right];
		arr[right]=arr[pivot];
		arr[pivot]=temp;
		return right;
		
	}
}
