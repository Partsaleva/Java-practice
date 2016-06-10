package threads.pi;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class CP  {
 
  
     
    public static void main(String args[]){
    	int k=0;
		int numberOfThreads = 0;
		boolean quiet=false;
		String fileName="result.txt";
		
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
	        //Get ExecutorService from Executors utility class, thread pool size is numberOfThreads
	        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
	        BigDecimal sum=new BigDecimal(0);
	        //Callable instance (PartSum)
	        Callable<BigDecimal> callable;
	        for(int i=0; i < k; i++){
	        	callable = new PartSum(i,quiet);
	            //submit Callable tasks to be executed by thread pool
	            Future<BigDecimal> future = executor.submit(callable);
	           
	            // using Future
	            try {
					sum.add(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
	        }
	      
	        System.out.println();
	        BigDecimal result= new BigDecimal(1).
	        		divide((new BigDecimal((2 * Math.sqrt(2)) / 9801).multiply(sum)));
	        System.out.println();
	        
	        //write result in file
	        try(FileWriter out= new FileWriter(fileName,true)){
	        	out.write(result.toString());
	        	out.write(System.getProperty("line.separator"));
	        } catch (IOException e) {
				e.printStackTrace();
			}
	        
	        //get time 
	        long time=System.nanoTime() - start;
	       
			printInfo(numberOfThreads, time);
			
	        //shut down the executor service now
	        executor.shutdown();
	    }
		
		
    }
    
    public static void printInfo(int threads, long time){
		System.out.println("Threads used in current run: " + threads);
		System.out.println("Total execution time for current run (millis): "+time);
	}
 
}