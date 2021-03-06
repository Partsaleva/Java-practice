package other;

public class Swap {

	public static void main(String[] args) {
		int a = 10; int b = 20; 
		// one way using arithmetic operator e.g. + or - 
		// won't work if sum overflows 
		System.out.printf("Before swap 'a': %d, 'b': %d %n", a, b); 
		a = a + b;
		b = a - b;  // actually (a + b) - (b), so now b is equal to a 
		a = a - b;  // (a + b) -(a), now a is equal to b 
		System.out.printf("After swapping, 'a': %d, 'b': %d %n", a, b); 
		System.out.println("********************************************");
		// another example 
		a = 30;
		b = 40;
		System.out.printf("Before swap 'a': %d, 'b': %d %n", a, b);
		a = (a + b) - (b = a); 
		System.out.printf("After swapping, 'a': %d, 'b': %d %n", a, b);
		System.out.println("********************************************");
		// Another way to swap integers without using temp variable is 
		// by using XOR bitwise operator 
		// Known as XOR trick 
		System.out.println("Swap two integers without third variable using XOR bitwise Operator");
		int x = 50; 
		int y = 60; 
		System.out.printf("Before swap 'x': %d, 'y': %d %n", x, y);
		x = x ^ y; 
		y = x ^ y; 
		x = x ^ y; 
		System.out.printf("After swapping, 'x': %d, 'y': %d %n", x, y);

		

	}

}
