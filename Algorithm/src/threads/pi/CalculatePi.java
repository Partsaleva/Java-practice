package threads.pi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class CalculatePi  {
 
  
     
    public static void main(String args[]){
    	int k=0;
		int numberOfThreads = 0;
		boolean quiet=false;
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-p")) {
				k = new Integer(args[i + 1]);
			}
			if (args[i].equals("-t")) {
				numberOfThreads = new Integer(args[i + 1]);
			}
			if (args[i].equals("-q")) {
				quiet = true;
			}
		}
		if (k <= 0 || numberOfThreads <= 0 || args.length < 4 || args.length > 5) {
			
			System.out.println("ERROR: Args are not correct!!!");
			
		}else{
			long start=System.nanoTime();
	        //Get ExecutorService from Executors utility class, thread pool size is 10
	        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
	        //create a list to hold the Future object associated with Callable
	        double result=0;
	        //Create MyCallable instance
	        Callable<Double> callable;
	        for(int i=0; i < k; i++){
	        	callable = new PartSum(i,quiet);
	            //submit Callable tasks to be executed by thread pool
	            Future<Double> future = executor.submit(callable);
	           
	            //add Future to the list, we can get return value using Future
	            try {
					result+=future.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	      
	        System.out.println();
	        System.out.println(1 / (((2 * Math.sqrt(2)) / 9801) * result));
	        
	        long time=System.nanoTime() - start;
	        if (!quiet) {
				printInfo(numberOfThreads, time);
			}
	        //shut down the executor service now
	        executor.shutdown();
	    }
		
		
    }
    
    public static void printInfo(int threads, long time){
		System.out.println("Threads used in current run: " + threads);
		System.out.println("Total execution time for current run (millis): "+time);
	}
 
}