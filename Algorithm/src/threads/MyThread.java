package threads;

public class MyThread extends Thread {
	String nameThread;
	int numThread;
	long k;
	boolean quit;
	
	public MyThread(String nameThread, long k, int numThread, boolean quit) {
		this.nameThread = nameThread;
		this.k = k;
		this.numThread = numThread;
		this.quit = quit;
	}

	public void run() {
		if (!quit) {
			System.out.println(nameThread + " is starting! "+ "Points "+ " !");
		}

		if (!quit) {
			System.out.println(nameThread + " is finishing! " + " !");
		}
	}

	

	
}