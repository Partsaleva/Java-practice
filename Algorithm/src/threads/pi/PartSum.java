package threads.pi;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.concurrent.Callable;

public class PartSum implements Callable<BigDecimal> {

	private int k;
	private boolean quiet;

	public PartSum(int k, boolean quiet) {
		this.k = k;
		this.quiet = quiet;
	}

	private static BigInteger factorial(int n) {
		BigInteger factorial = BigInteger.ONE;
		if (n == 0 || n == 1) {
			return factorial;
		}
		while (n > 1) {
			BigInteger N = BigInteger.valueOf(n);
			factorial = factorial.multiply(N);
			n--;
		}
		return factorial;
	}

	@Override
	public BigDecimal call() throws Exception {
		if (quiet) {
			return quietMethod();
		} else {
			return infoMethod();
		}
	}

	private BigDecimal quietMethod() {

		BigDecimal num = new BigDecimal(factorial(4 * k).multiply(BigInteger.valueOf(1103 + 26390 * k)));
		BigDecimal denom = new BigDecimal(factorial(k).pow(4).multiply(BigInteger.valueOf(396).pow(4 * k)));
		return (num.divide(denom, 1005, BigDecimal.ROUND_HALF_UP));
	}

	private BigDecimal infoMethod() {
		System.out.println(Thread.currentThread().getName() + " started");
		long start = Calendar.getInstance().getTimeInMillis();

		BigDecimal num = new BigDecimal(factorial(4 * k).multiply(BigInteger.valueOf(1103 + 26390 * k)));
		BigDecimal denom = new BigDecimal(factorial(k).pow(4).multiply(BigInteger.valueOf(396).pow(4 * k)));
		BigDecimal sum = num.divide(denom, 1005, BigDecimal.ROUND_HALF_UP);

		long time = Calendar.getInstance().getTimeInMillis() - start;

		System.out.println(Thread.currentThread().getName() + " stopped");
		System.out.println(Thread.currentThread().getName() + " execution time was (millis): " + time);
		;
		return sum;
	}
}