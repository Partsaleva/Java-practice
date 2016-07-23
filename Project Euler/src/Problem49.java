import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*The arithmetic sequence, 1487, 4817, 8147, in which each of the terms 
 *increases by 3330, is unusual in two ways: (i) each of the three terms 
 *are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, 
exhibiting this property, but there is one other 4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?*/
public class Problem49 {

    public static void main(String[] args) {
        int limit = 10000;
        List<Integer> primes=new ArrayList<>();
        for (int i = 1489; i < limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int first = 0; first < primes.size(); first++) {
            for (int second = first + 1; second < primes.size(); second++) {
                int third = primes.get(second) + (primes.get(second) - primes.get(first));
                if (third < limit && primes.contains(third)) {
                    if (isPermutation(primes.get(first), primes.get(second))
                            && isPermutation(primes.get(first), third)) {
                        result.append(Integer.toString(primes.get(first)))
                                .append(Integer.toString(primes.get(second)))
                                .append(Integer.toString(third));
                        break;
                    }
                }
            }
            if (result.length() > 0) {
                break;
            }
        }
        System.out.println(result);
    }

    private static boolean isPermutation(int test, int number) {
        int[] arr = new int[10];
        while(test > 0){
            arr[test % 10]++;
            test /= 10;
        }
        while(number > 0){
            arr[number % 10]--;
            number /= 10;
        }    
        for(int i = 0; i< 10; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
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
