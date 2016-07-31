import java.math.BigInteger;

public class Problem57 {

    public static void main(String[] args) {
        int count = 0;
         
        BigInteger den = BigInteger.valueOf(2);
        BigInteger num = BigInteger.valueOf(3);
         
        for (int i = 1; i < 1000; i++) {
             num =num.add(BigInteger.valueOf(2).multiply(den));
             den = num.subtract(den);
             if (num.toString().length() > den.toString().length()) {
                count++;
            }
        }

        System.out.println(count);
    }

}
