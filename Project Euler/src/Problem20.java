import java.math.BigInteger;

/*n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!*/
public class Problem20 {

    public static void main(String[] args) {
       
        System.out.println(sumOfDigits(100));

    }

    public static int sumOfDigits(int number){
        int sum = 0;
        BigInteger factorial = BigInteger.valueOf(1);
         
        for (int i = 2; i <= number; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i)); 
        }       
  //      System.out.println(factorial);
        String num=factorial.toString();
        for (int i = 0; i < num.length(); i++) {
            sum+=num.charAt(i)-'0';
        }
        return sum;
    }
    
   
}
