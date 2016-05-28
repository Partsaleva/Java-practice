package threads.pi;

import java.util.concurrent.Callable;

public class PartSum implements Callable<Double>{

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
	public Double call() throws Exception {
		if(quiet){
			return quietMethod();
		}
		else{
			return infoMethod();
		}
	}
	

	private Double quietMethod() {
		return (fact(4*k)*(1103+(26390*k)))/
				((Math.pow(fact(k), 4))*Math.pow(396, (4*k)));
	}


	private Double infoMethod(){
		System.out.println(Thread.currentThread().getName() + " started");
		long start = System.nanoTime();
		double sum=(fact(4*k)*(1103+(26390*k)))/
				((Math.pow(fact(k), 4))*Math.pow(396, (4*k)));

		long time=System.nanoTime() - start;
	    System.out.println(Thread.currentThread().getName() + " stopped");
	    System.out.println(Thread.currentThread().getName() + 
	    		" execution time was (millis): "+ time);;
	    return sum;
	}
}
