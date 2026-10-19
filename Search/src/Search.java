
public class Search {
	public static int linear(int [] nums, int temp) {
		for(int i=0;i<nums.length; i++) {
			if (nums[i]==temp) return i;
		}
		return -1;
	}
	
	public static int binary(int [] nums, int temp, int start, int last) {
		int mid=start+(last-start)/2;
		
		if(start>last) return -1;
		if(nums[mid]==temp) {
			return mid;
		}
		else if(temp<nums[mid]){
			return binary(nums,temp, start, mid-1);
		}
		else {
			return binary(nums,temp,mid+1,last);
		}
	}
}
