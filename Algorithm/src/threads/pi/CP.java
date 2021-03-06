package threads.pi;



import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CP {

	public static void main(String args[]) {
		int k = 0;
		int numberOfThreads = 0;
		boolean quiet = false;
		String fileName = "result.txt";

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-p")) {
				k = new Integer(args[i + 1]);
			}
			if (args[i].equals("-t") || args[i].equals("-task")) {
				numberOfThreads = new Integer(args[i + 1]);
			}
			if (args[i].equals("-o")) {
				fileName = args[i + 1];
			}
			if (args[i].equals("-q")) {
				quiet = true;
			}
		}
		if (k <= 0 || numberOfThreads <= 0 || args.length < 4 || args.length > 8) {
			System.out.println("Please enter correct arguments!!!");
		} else {
			long start = Calendar.getInstance().getTimeInMillis();
			// Get ExecutorService from Executors utility class, thread pool
			// size is numberOfThreads
			ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
			BigDecimal sum = new BigDecimal(0);
			// Callable instance (PartSum)
			Callable<BigDecimal> callable;
			List<Future<BigDecimal>> futures=new ArrayList<>();
			
			for (int i = 0; i < k; i++) {
				callable = new PartSum(i, quiet);
				// submit Callable tasks to be executed by thread pool
				Future<BigDecimal> future = executor.submit(callable);
				futures.add(future);				
			}

			for (Future<BigDecimal> future : futures) {
				// using Future
				try {
					sum = sum.add(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
			System.out.println();

			BigDecimal result = BigDecimal.valueOf(1).divide(((BigDecimal.valueOf(2).multiply(sqrt2(500)))
					.divide(BigDecimal.valueOf(9801), 1005, BigDecimal.ROUND_HALF_UP)).multiply(sum), 1000,
					BigDecimal.ROUND_HALF_UP);

			System.out.println();

			// write result in file
			try (FileWriter out = new FileWriter(fileName, true)) {
				out.write(result.toString());
				out.write(System.getProperty("line.separator"));
			} catch (IOException e) {
				e.printStackTrace();
			}

			// get time
			long time = Calendar.getInstance().getTimeInMillis() - start;

			printInfo(numberOfThreads, time);

			// shut down the executor service now
			executor.shutdown();
		}

	}

	private static BigDecimal sqrt2(int prec) {
		BigDecimal sqrt;
		BigDecimal[] buffer = new BigDecimal[prec + 1];
		BigDecimal initial = new BigDecimal("1.414");
		buffer[0] = initial;
		for (int i = 1; i <= prec; i++) {
			buffer[i] = buffer[i - 1].divide(BigDecimal.valueOf(2), prec * 5, BigDecimal.ROUND_HALF_UP)
					.add(BigDecimal.valueOf(1).divide(buffer[i - 1], prec * 5, BigDecimal.ROUND_HALF_UP));
		}
		sqrt = buffer[prec];
		return sqrt;
	}

	public static void printInfo(int threads, long time) {
		System.out.println("Threads used in current run: " + threads);
		System.out.println("Total execution time for current run (millis): " + time);
	}

}