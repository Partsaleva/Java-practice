import java.util.ArrayList;
import java.util.List;

/*We shall say that an n-digit number is pandigital if it makes use of all the 
 digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
What is the largest n-digit pandigital prime that exists?*/
public class Problem41 {
//TODO need improvement
    public static void main(String[] args) {
        List<Long> primes =new ArrayList<>();
        for (long i = 987654321; i > 2143; i--) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        long result=0;
        for (long i = primes.size(); i >0; i--) {
            if (isPandigital(Long.toString(i))) {
                result=i;
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean isPandigital(String num){       
        if (num.length()!=9) {
            return false;
        }
        for (int i = 1; i < 10; i++) {
            if (!num.contains(Integer.toString(i))){
                return false;
            }
        }
        return true;        
    }
    
    private static boolean isPrime(long number){
        int lim=(int)Math.sqrt(number);
        for (int i = 2; i <= lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
