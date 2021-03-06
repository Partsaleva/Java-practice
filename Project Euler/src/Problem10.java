import java.util.ArrayList;
import java.util.BitSet;


/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.*/
public class Problem10 {

	public static void main(String[] args) {
		sieveOfEratostenes();
		System.out.println();
		bruteForce();
	}

	
	private static void sieveOfEratostenes(){
		System.out.println("Sieve of Eratostenes");
		long start=System.currentTimeMillis();		
		long sum=0;
		int N= 2_000_000;
		BitSet isPrime= new BitSet(N);
		isPrime.set(0, false);
		isPrime.set(1, N);
		
		for (int i = 2; i <N; i++) {
			if (isPrime.get(i-1)) {
				sum+=i;
				
				for (int j = 2*i; j < N; j+=i) {
					isPrime.set(j-1, false);
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start + " ms");
		System.out.println(sum);
	}
	
	private static void bruteForce(){
		System.out.println("Brute force");
		long start=System.currentTimeMillis();
		
		ArrayList<Integer> primes=new ArrayList<>();
		primes.add(2);
		long sum=2,sqrtNum=0;
		boolean isPrime=false;
		for (int i = 2; i < 2_000_000; i++) {
			isPrime=true;
			sqrtNum=(int) Math.sqrt(i);
			for (int j = 0; j < sqrtNum; j++) {
				if (i % primes.get(j) == 0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				primes.add(i);
				sum+=i;
			}
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start + " ms");
		System.out.println(sum);
	}
}
