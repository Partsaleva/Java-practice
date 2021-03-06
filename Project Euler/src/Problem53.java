import java.math.BigInteger;

/*There are exactly ten ways of selecting three from five, 12345:

123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
In combinatorics, we use the notation, C ^3,5= 10.
In general,
Cnr =   n!/r!(n−r)!
,where r ≤ n, n! = n×(n−1)×...×3×2×1, and 0! = 1.
It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066.
How many, not necessarily distinct, values of  nCr, for 1 ≤ n ≤ 100, are greater than one-million?*/
public class Problem53 {

    public static void main(String[] args) {
    //brute force - can improve 
        int count=0, limit =1_000_000;
        for (int n = 10; n <=100; n++) {
            for (int r = 1; r < n; r++) {
                if(factorial(n).
                        divide(factorial(r).multiply(factorial(n-r)))
                        .compareTo(BigInteger.valueOf(limit))> 0)
                    count++;
                
            }
        }
        System.out.println(count);
    }

    private static BigInteger factorial(int number) {
        if (number < 2) {
            return BigInteger.valueOf(1);
        }      
        return BigInteger.valueOf(number).multiply(factorial(number-1));     
    }
}
