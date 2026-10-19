
public class Postfix {
	public static void expression(Stack stack, String str) {
//		String number="";
//		for(char x: str.toCharArray()) {
//			
//			if(!number.isEmpty()) {
//				stack.push(Integer.parseInt(number));
//				number="";
//			}
//			
//			if(x!= ' ' && Character.isDigit(x)) {
//				number+=x;
//			}
//			
//			else if(x=='+' || x=='-' || x=='*' || x=='/' ) {
//				if(!number.isEmpty()) {
//					stack.push(Integer.parseInt(number));
//					number="";
//				}
//				
//				int a = stack.pop();
////				stack.peek();
//				int b = stack.pop();
////				stack.peek();
//				switch(x) {
//				case '+':
//					stack.push(b+a);
//					break;
//				case '-':
//					stack.push(b-a);
//					break;
//				case '*':
//					stack.push(b*a);
//					break;
//				case '/':
//					stack.push(b/a);
//	                break;
//				}
//			}
//		}
//		
//		
//		stack.peek();
		
		String [] stringArr;
		str.trim();
		stringArr=str.split(" ");
		for(String s: stringArr) {
			if(s.isEmpty()) {
				continue;
			}
			else if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				int a = stack.pop();
			int b = stack.pop();
			switch(s) {
				case "+":
					stack.push(b+a);
					break;
				case "-":
					stack.push(b-a);
					break;
				case "*":
					stack.push(b*a);
					break;
				case "/":
					stack.push(b/a);
					break;
			}
			}
			else {
				stack.push(Integer.parseInt(s));
			}
		}
		stack.peek();
		
	}
}
