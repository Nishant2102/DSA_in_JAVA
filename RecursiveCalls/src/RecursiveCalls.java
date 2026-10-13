import java.lang.Math;


public class RecursiveCalls {
	public static int quotient(int divisor, int dividend) {
		int quotient = 0;
		if(dividend<divisor) return 0;
		if(dividend>=divisor) {
			quotient+=1;
		}
		return quotient+=quotient(divisor,dividend-divisor);
	}
	
	public static int absQuotient(int divisor, int dividend) {
		return ((divisor<0 || dividend<0)&& !(divisor<0 && dividend<0))? (-1)*quotient(Math.abs(divisor), Math.abs(dividend)):quotient(Math.abs(divisor), Math.abs(dividend));
	}
	
	public static int remainder(int divisor, int dividend) {
		int remainder = dividend;
		if(remainder<divisor) return remainder;
		return remainder(divisor,dividend-divisor);
	}
	
	public static int absRemainder(int divisor, int dividend) {
		return ((divisor<0 || dividend<0)&& !(divisor<0 && dividend<0))? (-1)*remainder(Math.abs(divisor), Math.abs(dividend)):remainder(Math.abs(divisor), Math.abs(dividend));
	}
	
	public static int multiply(int num1, int num2) {
		int result=num1;
		if(num2==0) return 0;
		return result+=multiply(num1,num2-1);
	}
	
	public static int optimalMultiply(int num1, int num2) {
		int result;
		if(Math.abs(num1)<Math.abs(num2)) {
			result=multiply(Math.abs(num2),Math.abs(num1));
		}
		else {
			result=multiply(Math.abs(num1),Math.abs(num2));
		}
		return ((num1<0 || num2<0)&& !(num1<0 && num2<0))? (-1)*result:result;
	}
	
}
