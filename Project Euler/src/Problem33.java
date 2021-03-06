/*The fraction 49/98 is a curious fraction, as an inexperienced mathematician 
in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which 
is correct, is obtained by cancelling the 9s.
We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
There are exactly four non-trivial examples of this type of fraction,
less than one in value, and containing two digits in the numerator and denominator.
If the product of these four fractions is given in its lowest common terms,
find the value of the denominator.*/
public class Problem33 {

	public static void main(String[] args) {

		int result=1;
		double number=0;
		double reducedNumber=0;
		// 10 < num < den < 100
		//1 =< n < d =< 9
		for (int i = 1; i < 10; i++) {
		    for (int d = 1; d < i; d++) {
		        for (int n = 1; n < d; n++) {
		        	//  n/d
		        	reducedNumber=reducedNumber(n, d);
		        	
		        	//example: 12/14
		        	number=origNumber(10*i+n, 10*i +d);
		        	result=addResultIfEqual(number, reducedNumber, d, n, result);
		        	
		        	//example: 12/41
		        	number=origNumber(10*i+n, 10*d+i);
		        	result=addResultIfEqual(number, reducedNumber, d, n, result);
		        	
		        	//example: 21/14
		        	number=origNumber(10*n+i, 10*i+d);
		        	result=addResultIfEqual(number, reducedNumber, d, n, result);
		        	
		        	//example: 21/41
		        	number=origNumber(10*n+i, 10*d+i);
		        	result=addResultIfEqual(number, reducedNumber, d, n, result);
		        }
		    }
		}
		System.out.println(result);
	
	}

	private static int addResultIfEqual(double number, double reducedNumber, int d, int n, int result){
		 if (number == reducedNumber) {		           
         	result*=d;
         	result/=n;
         }
		return result;
	}
	private static double origNumber(int numerator, int denominator){
		return	(double)numerator/(double)denominator;	
	}
	
	private static double reducedNumber(int numerator, int denominator){
		return	(double)numerator/(double)denominator;	
	}
}
