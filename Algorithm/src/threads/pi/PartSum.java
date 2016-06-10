package threads.pi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;

public class PartSum implements Callable<BigDecimal>{

	private int k;
	private boolean quiet;
	
	public PartSum(int k, boolean quiet) {
		this.k = k;
		this.quiet=quiet;
	}
	
	
	public int fact(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
	@Override
	public BigDecimal call() throws Exception {
		if(quiet){
			return quietMethod();
		}
		else{
			return infoMethod();
		}
	}
	

	private BigDecimal quietMethod() {
		return new BigDecimal((fact(4*k)*(1103+(26390*k))))
				.divide(new BigDecimal(Math.pow(fact(k), 4)).multiply(new BigDecimal(Math.pow(396, (4*k)))),RoundingMode.HALF_UP);
	}


	private BigDecimal infoMethod(){
		System.out.println(Thread.currentThread().getName() + " started");
		long start = System.nanoTime();
		
		BigDecimal sum=new BigDecimal((fact(4*k)*(1103+(26390*k))))
				.divide(new BigDecimal(Math.pow(fact(k), 4)).multiply(new BigDecimal(Math.pow(396, (4*k)))));
			
		long time=System.nanoTime() - start;
		
	    System.out.println(Thread.currentThread().getName() + " stopped");
	    System.out.println(Thread.currentThread().getName() + 
	    		" execution time was (millis): "+ time);;
	    return sum;
	}
}