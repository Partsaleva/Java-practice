import java.util.ArrayList;
import java.util.List;

/*The first two consecutive numbers to have two distinct prime factors are:

14 = 2 × 7
15 = 3 × 5

The first three consecutive numbers to have three distinct prime factors are:

644 = 2² × 7 × 23
645 = 3 × 5 × 43
646 = 2 × 17 × 19.

Find the first four consecutive integers to have four distinct prime factors. 
What is the first of these numbers?*/
public class Problem47 {

    public static void main(String[] args) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
       
        int target = 4;
        int consec = 1;
        int number = 2 * 3 * 5 *7;
         
        while (consec < target) {
            number++;
            if (primeFactors(number, primes)== 4) {
                consec++;
            } else {
                consec = 0;
            }
        }

        System.out.println(number-3);
    }

    private static int primeFactors(int number, List<Integer> primes) {
        int count=0;
        boolean found=false;
        for (int i = 0; i < primes.size(); i++) {
            found=false;
            while (number % primes.get(i) == 0) {
                found = true;
                number = number / primes.get(i);
            }
            if (found){
                count++;
            }
            if (number == 1) {
                return count;
            }
        }
        return count;
    }
    
    private static boolean isPrime(int number){
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
