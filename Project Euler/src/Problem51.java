import java.util.ArrayList;
import java.util.List;

public class Problem51 {

    public static void main(String[] args) {
        List<Integer> primes=new ArrayList<>();
        for (int i = 100000; i < 1_000_000; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        String number="";
        for (int i = 0; i < primes.size(); i++) {
            number=Integer.toString(primes.get(i));
            if (count(number, "0")==3 && primeFamily(number, "0")||
                count(number, "1")==3 && !number.endsWith("1") && primeFamily(number, "1")||
                count(number, "2")==3 && primeFamily(number, "2")) {
                System.out.println(number);
            }
        }
       

    }

    private static int count(String number, String digit){
        return number.length()-number.replaceAll(digit, "").length();
    }
    
    private static boolean primeFamily(String prime, String replacedDigit){
        int c=0; int n=0;   
        String digit= "0123456789";
        for (int i = 0; i < digit.length(); i++) {
            n=Integer.parseInt(prime.replaceAll(replacedDigit, Character.toString(digit.charAt(i))));
            if (n>100_000 && isPrime(n)) {
                c++;
            }
        }              
        return c==8;
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
