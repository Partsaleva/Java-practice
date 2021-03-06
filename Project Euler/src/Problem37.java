import java.util.ArrayList;
import java.util.List;

/*The number 3797 has an interesting property. Being prime itself, 
 * it is possible to continuously remove digits from left to right, 
 * and remain prime at each stage: 3797, 797, 97, and 7. Similarly 
 * we can work from right to left: 3797, 379, 37, and 3.
Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.*/
public class Problem37 {

    public static void main(String[] args) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 20; i < 1_000_000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        int sum=0, count = 0, i = 0;
        int number = 0, reversedNumber = 0, multiplier = 1;
        boolean isTruncatablePrime = false;
        while (count < 11) {
            number = primes.get(i);
            reversedNumber = 0;
            multiplier = 1;
            isTruncatablePrime = true;
            while (number > 0 && isTruncatablePrime) {
                reversedNumber += multiplier * (number % 10);
                isTruncatablePrime = isPrime(reversedNumber) && isPrime(number);
                number /= 10;
                multiplier *= 10;
            }
         
            if (isTruncatablePrime) {
                count++;
                sum +=primes.get(i);
            }        
            i++;
        }
        
        System.out.println(sum);
    }
    
    private static boolean isPrime(long number){
        if (number<2) {
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
