package homework1JavaSyntax.task910and11;

public class HitTheTarget {

	public static void main(String[] args) {
		printPairs(5);
		printPairs(35);
		printPairs(0);

	}

	public static void printPairs(int number){
		for (int i = 1; i <=20; i++) {
			
			for (int j = 1; j < number; j++) {
				if((i + j) == number){
					System.out.format("%d + %d = %d%n", i, j, number);
				}
			}
			
			for (int j = number+1; j < 21-number; j++) {
				if((i - j) == number){
					System.out.format("%d - %d = %d%n", i, j, number);
				}
			}
		}
	}
}
