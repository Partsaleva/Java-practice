/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/
public class Problem09 {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		int sum = 1000;
		for (a = 1; a < sum / 3; a++) {
			
		    for (b = a; b < sum / 2; b++) {
		        c = sum - a - b;
		 
		        if (a * a + b * b == c * c) {
		        	System.out.println(a*b*c);
		        }
		    }
		}
		
	}

}
