
public class Problem3 {

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
