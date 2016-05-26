package threads.pi;

import java.math.BigDecimal;
import java.util.Calendar;

public class CalculatePi{
	
	public static void main(String[] args) {
		int k=0;
		int numberOfThreads = 0;
		boolean quiet=false;
		Thread[] array;
		long sum = 0;
		
		int begin=0, end = 0;
	
		long timeOfStart = Calendar.getInstance().getTimeInMillis();
		
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
			 array=new Thread[numberOfThreads];
			 for (int i = 0; i < numberOfThreads; i++) {
				begin=(i * k)/numberOfThreads;
				end= k *(i+1)  / numberOfThreads;
				
				MyThread partSum=new MyThread("Thread " +i, begin, end);
				Thread thread=new Thread(partSum);
				thread.start();
				array[i]=thread;
				sum+=partSum.getSum();	
				
			}
			
			for (int i = 0; i < array.length; i++) {
				try {
					array[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			 
			 System.out.println(1 / (((2 * Math.sqrt(2)) / 9801) * sum));
		}
		
		
		
		
		
		
		
		
		
		
	} 
		


	
	
	
	public  double ramanujanSeries(long n) {
		double sum = 0;
		for(int k = 0; k < n; k++){
			
		}
		return 1 / (((2 * Math.sqrt(2)) / 9801) * sum);
	}

	
}
