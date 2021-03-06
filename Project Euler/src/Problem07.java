import java.util.ArrayList;
import java.util.List;

/*By listing the first six prime numbers: 
 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/
public class Problem07 {

	public static void main(String[] args) {
		int limit = 10_001;
		List<Integer> primes=new ArrayList<>();
		primes.add(2); 
		
		boolean isPrime;
		int pr=1;
		
		while(primes.size() < limit){
			pr+=2;
			isPrime=true;
			for (int i = 0; i < primes.size(); i++) {
				if (pr % primes.get(i) == 0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				primes.add(pr);
			}
		}
		System.out.println(pr);
	}

}
