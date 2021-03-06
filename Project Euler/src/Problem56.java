import java.math.BigInteger;

/*A googol (10^100) is a massive number: one followed by one-hundred zeros; 
  100^100 is almost unimaginably large: one followed by two-hundred zeros.
   Despite their size, the sum of the digits in each number is only 1.

Considering natural numbers of the form, a^b, where a, b < 100, what is the maximum digital sum?*/
public class Problem56 {

    public static void main(String[] args) {
        int result=0, sum=0;
        BigInteger number=null;
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <= 100; b++) {
                number=BigInteger.valueOf(a).pow(b);
                sum=sumOfDigits(number);
                if ( sum > result) {
                    result=sum;
                }
            }
        }

        System.out.println(result);
    }

    private static int sumOfDigits(BigInteger number) {
        int sum=0;
        String num=number.toString();
        for (int i = 0; i < num.length(); i++) {
            sum+=num.charAt(i)-'0';
        }
        return sum;
    }

}
