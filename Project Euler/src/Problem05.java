import java.util.ArrayList;
import java.util.List;

public class Problem05 {

	public static void main(String[] args) {
		int max=20;
		List<Integer> primes=generatePrimes(max);
//		System.out.println(primes);
		int result = 1;
		 
		for (int i = 0; i < primes.size(); i++) {
			
			int a =  (int) (Math.log(max) / Math.log(primes.get(i)));
		    result = result * ((int)Math.pow(primes.get(i),a));
		}
		
		System.out.println(result);
	}

	public static List<Integer> generatePrimes(int limit){
		List<Integer> nums=new ArrayList<>();
		nums.add(2);
		boolean isPrime;
		int sqrtNum=0;
		for (int i = 3; i < limit; i=i+2) {
			isPrime=true;
			sqrtNum=(int) Math.sqrt(i);
			for (int j = 0; j < sqrtNum; j++) {
				if (i % nums.get(j) == 0) {
					isPrime=false;
					break;
				}
			}
			if (isPrime) {
				nums.add(i);
			}
		}
		return nums;
	}
}
