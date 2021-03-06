import java.math.BigDecimal;

/*The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.*/
public class Problem48 {

    public static void main(String[] args) {
        BigDecimal sum=BigDecimal.valueOf(0);
        for (int i = 1; i <= 1000; i++) {
            sum=sum.add(BigDecimal.valueOf(i).pow(i));
        }
        String result=sum.toString();
        System.out.println(result.substring(result.length()-10, result.length()));
    }

}
