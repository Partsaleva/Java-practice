import java.util.ArrayList;
import java.util.List;

/*The number, 197, is called a circular prime because all 
 rotations of the digits: 197, 971, and 719, are themselves prime.
There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
How many circular primes are there below one million?*/
public class Problem35 {

    public static void main(String[] args) {
        List<Long> primes=new ArrayList<>();
        for (long i = 2; i < 1_000_000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        primes=reducePrimes(primes);
        System.out.println(primes.size());
     

    }

  
    
    public static List<Long> reducePrimes(List<Long> primes){
        long number=0;
        for (int i = 0; i < primes.size(); i++) {
            number=primes.get(i);
            while(number>0){
                long n=number %10;
                if (n%2==0 || n == 5) {
                    primes.remove(i);
                }
                number/=10;
            }            
        }     
        return primes;       
    }
    
    private static boolean isPrime(long number){
        int lim=(int)Math.sqrt(number);
        for (int i = 2; i < lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
