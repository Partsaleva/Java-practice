package threads;

public class Run {

	public static void main(String[] args) {
		//Exercise 1 
		for(int i = 0; i < 5; i++){
			new Thread(new ExerciseOne("Start")).start();			
		}
		
		
		
		
		
	}

}
