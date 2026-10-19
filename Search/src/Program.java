
public class Program {
	public static void main(String [] args) {
		int [] arr= {1,2,3,4,5,6,7,8,9};
		
		int x= Search.linear(arr, 5);
		int y=Search.binary(arr, 7, 0, arr.length-1);
		
		System.out.println(x+" "+y);
	}
}
