package threads;
/*
 * Exercise 1: (2) Implement a Runnable. Inside run( ), print a message, and then call
yield( ). Repeat this three times, and then return from run( ). Put a startup message in the
constructor and a shutdown message when the task terminates. Create a number of these
tasks and drive them using threads.*/
public class ExerciseOne implements Runnable{

	
	public ExerciseOne(String startupMessage){
		System.out.println(startupMessage);
	}
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("message "+ (i+1));
		}
		System.out.println("Task completed");
		Thread.yield();
		return;
	}


}
