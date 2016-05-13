package threads;

import java.util.Calendar;

public class CalculatePi{

	public static void main(String[] args) {
		long timeOfStart = Calendar.getInstance().getTimeInMillis();
		
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-p")) {
				k = new Long(args[i + 1]);
			}
			if (args[i].equals("-t")) {
				numThread = new Integer(args[i + 1]);
			}
			if (args[i].equals("-q")) {
				quit = true;
			}
		}
		if (k <= 0 || numThread <= 0 || args.length < 4
				|| args.length > 5) {
			System.out.println("ERROR: Args are not correct!!!");
		} 
		
		else {
			array = new MyThread [numThread];
		
			for (int i = 0; i < numThread; i++) {
				
				MyThread thread = new MyThread("Thread " + Integer.toString(i),
						k, numThread,quit);
				thread.start();
				array[i]=thread;
			}
		}
		
		for (int i = 0; i < numThread; i++) {
			try {
				array[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		}
		
		double pi = ramanujanSeries(k);
		long timeOfEnd = Calendar.getInstance().getTimeInMillis();
		if (!quit) {
			;
		}
		System.out.println("Time of calculate Pi: " + (timeOfEnd - timeOfStart)
				+ " millis");
		System.out.println("Calculate Pi: " + pi);

	}
	static String threadName;
	static int numThread;
	static long k;
	static boolean quit = false;
	static MyThread[] array;

	public static int fact(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

	public static double ramanujanSeries(long n) {
		double sum = 0;
		for(int k = 0; k < n; k++){
			sum += ((fact(4 * k)) * (1103 + (26390 * k))) / (Math.pow(fact(k), 4) * Math.pow(396, (4 * k)));	
		}
		return 1 / (((2 * Math.sqrt(2)) / 9801) * sum);
	}

	
}
