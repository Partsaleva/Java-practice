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

		//11 <=num< den <=99
		float number = 1;
		float numberWithoutRepeated = 1;
		 
		for (int i = 1; i < 10; i++) {
		    for (int num = i; num < 10; num++) {
		        for (int den = 1; den < num; den++) {
		        	//System.out.println(i*10 +den);
		        	//System.out.println(num*10+i);
		        	number=(float)(i*10 +den)/(float)(num*10+i);
		        	numberWithoutRepeated=(float)den/(float)num;
		        	
		        //	System.out.println(den);
		        //	System.out.println(num);
		        	if ((i*10 +den)==31) {
		        		System.out.println((i*10 +den)+"/"+(num*10+i));
					}
		        	
		        	
		        }
		    }
		}
		
	}

	private static int findDenominator(){
		//from 10 to 99 included (we don't need 10) 
		for (int i = 11; i < 100; i++) {
			if (i%10 == 0) {
				continue;
			}
			for (int j = 11; j < 100; j++) {
				if (j%10 == 0) {
					continue;
				}
				
			}
		}
		return 0;
		
	}
}