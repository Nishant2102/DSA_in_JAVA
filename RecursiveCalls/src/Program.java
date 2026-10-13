
public class Program {
	public static void main(String []args) {
		
		
		System.out.println("Quotient "+RecursiveCalls.quotient(3,200));
		System.out.println("Negative Handlig Quotient "+RecursiveCalls.absQuotient(-4, 123));
		System.out.println("Remainder "+RecursiveCalls.remainder(4, 123));
		System.out.println("Negative Handling Reaminder "+RecursiveCalls.absRemainder(4, -123));
		System.out.println("Multiply "+RecursiveCalls.multiply(4, 123));
		System.out.println("Optimal Negative Handling Multiply "+RecursiveCalls.optimalMultiply(4, -123));
	}
}
