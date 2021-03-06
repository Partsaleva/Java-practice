import java.util.ArrayList;
import java.util.List;

/*The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, 
contains 21 terms, and is equal to 953.
Which prime, below one-million, can be written as the sum of the most consecutive primes?*/
public class Problem50 {

    public static void main(String[] args) {
        int limit = 1_000_000;
        List<Long> primes=new ArrayList<>();
        for (long i = 2; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        
        long result = 0;
        int numberOfPrimes = 0;
        List<Long> sumOfPrimes=new ArrayList<>();
        long sum=0;
        int k=0;
        while (sum < limit) {
            sum+=primes.get(k);
            sumOfPrimes.add(sum);
            k++;
        }
        for (int i = numberOfPrimes; i < sumOfPrimes.size(); i++) {
            for (int j = i-(numberOfPrimes+1); j >= 0; j--) {       
                if (primes.contains(sumOfPrimes.get(i) - sumOfPrimes.get(j))){
                    numberOfPrimes = i - j;
                    result = sumOfPrimes.get(i) - sumOfPrimes.get(j);
                }
            }
        }
        System.out.println(result);
        System.out.println(numberOfPrimes);
    }


    private static boolean isPrime(long number){
        if (number < 2) {
            return false;
        }
        int lim=(int)Math.sqrt(number);
        for (int i = 2; i <= lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
