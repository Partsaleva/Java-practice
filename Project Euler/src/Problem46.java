import java.util.ArrayList;
import java.util.List;

/*It was proposed by Christian Goldbach that every odd composite 
 number can be written as the sum of a prime and twice a square.
9 = 7 + 2×1^2
15 = 7 + 2×2^2
21 = 3 + 2×3^2
25 = 7 + 2×3^2
27 = 19 + 2×2^2
33 = 31 + 2×1^2
It turns out that the conjecture was false.
What is the smallest odd composite that cannot be 
written as the sum of a prime and twice a square?*/
public class Problem46 {

    public static void main(String[] args) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        
        int number=5,result =0;
        boolean found=true;
        while (found) {
            int j=0;
            found=false;
            while (number >= primes.get(j)) {
                if (isTwiceSquare(number-primes.get(j))) {
                    found=true;
                    result=number;
                    break;
                }
                j++;
            }
            number+=2;
        }
        System.out.println(result);
    }

    private static boolean isTwiceSquare(int number) {
        return Math.sqrt(number/2) % 1 ==0;
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
