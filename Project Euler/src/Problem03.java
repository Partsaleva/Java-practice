/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?*/


public class Problem03 {

	public static void main(String[] args) {
		long number=600851475143l;
		long largestFact = 0;
		int max=(int) Math.sqrt(number);
		
		for (int i = 2; i < max; i++) {
			if (number % i == 0) {
				number /= i;
				largestFact = i;
			}
		}
		System.out.println(largestFact);
	
		
	}

	
}
