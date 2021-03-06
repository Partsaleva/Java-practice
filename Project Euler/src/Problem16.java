import java.math.BigDecimal;

/* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?  */
public class Problem16 {

	public static void main(String[] args) {
		BigDecimal number=new BigDecimal(Math.pow(2, 1000));
		String n=number.toString();
		int sum=0;
		for (int i = 0; i < n.length(); i++) {
			sum+=n.charAt(i) -'0';
		}
		System.out.println(sum);
	}

}
