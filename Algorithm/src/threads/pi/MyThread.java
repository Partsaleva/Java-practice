package threads.pi;


public class MyThread implements Runnable {
	private String nameThread;
	private int begin;
	private int end;
	private double sum;
	
	

	

	public MyThread(String nameThread, int begin, int end) {
		this.nameThread = nameThread;
		this.begin = begin;
		this.end = end;
	}

	public double getSum() {
		return sum;
	}

	public int fact(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
//TODO wrong sum
	public void ramanujanSeries() {
		for(int k = begin; k < end; k++){
			sum += fact(4 * k)	* (1103 + 26390*k) / 
					Math.pow(fact(k),4) * Math.pow(396, 4*k);
		}
		System.out.println(sum);
	}



	@Override
	public void run() {
		ramanujanSeries();
		
	}

}
	

	