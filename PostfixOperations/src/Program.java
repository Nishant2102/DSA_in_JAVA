import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		Stack stack = new Stack();
		try (Scanner sc =new Scanner(System.in)){
//			stack.push(8);
//			stack.push(5);
//			stack.push(6);
//			stack.push(3);
//			stack.push(2);
//			stack.push(10);
			
			System.out.println("Enter Postfix expression: ");
			Postfix.expression(stack, sc.nextLine());
			
			
//			while(!stack.isEmpty()) {
//				System.out.println(stack.peek());
//				stack.pop();
//			}
		} 
	}
	
	
}
