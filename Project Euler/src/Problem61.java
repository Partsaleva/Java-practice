import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem61 {

	public static void main(String[] args) {
		Map<Integer, List<Integer>> res = new HashMap<>();
		for (int i = 3; i < 9; i++) {
			List<Integer> list=generateNumbersOfEveryType(i);
			res.put(i,list);
		}
		
		for (Map.Entry<Integer, List<Integer>> entry : res.entrySet()) {
			System.out.println(entry.getKey() +" :"+ entry.getValue());
		}
		
		List<Integer> types=Arrays.asList(3, 4, 5, 6, 7, 8);
		List<Integer> l;
		int current=0;
		
	
		
		//System.out.println(result);
		
		
		
	}
	
	
	private static int firstTwoDigits(long number){
		String num = String.valueOf(number);
		int i = Character.digit(num.charAt(0), 10)*10;
		int j =Character.digit(num.charAt(1), 10);
		return i+j;		
	}
	private static int lastTwoDigits(long number){
		String num = String.valueOf(number);
		int i = Character.digit(num.charAt(2), 10)*10;
		int j =Character.digit(num.charAt(3), 10);
		return i+j;	
		
	}
	private static List<Integer> generateNumbersOfEveryType(int type) {

		List<Integer> listOfNumbers=new ArrayList<>();
		int n = 0;
		int number = 0;

		while (number < 10_000) {
			n++;
			switch (type) {

			case 3:
				//Triangle numbers
				number = n * (n + 1) / 2;
				break;
			case 4:
				// Square numbers
				number = n * n;
				break;
			case 5:
				// Pentagonal numbers
				number = n * (3 * n - 1) / 2;
				break;
			case 6:
				//Hexagonal numbers
				number = n * (2*n - 1);
				break;
			case 7:
				//Heptagonal numbers
				number = n * (5 * n - 3) / 2;
				break;
			case 8:
				//Octagonal numbers
				number = n * (3 * n - 2);
				break;
			}
			if (number > 1010 && number <10_000 &&
					lastTwoDigits(number) > 10){
				listOfNumbers.add(number);
			}

		}

		return listOfNumbers;
	}

	/* 
	private static boolean hasRoot(int type, long number){
		double root=0;
		 switch (type) {

         case 3:
             //Triangle numbers
             // n * (n + 1) / 2;
        	 root= (-1+ Math.sqrt(1+number*8) )/2;       	
             break;
         case 4:
             // Square numbers
             //number = n * n;
        	 root=(-1 + Math.sqrt(number))/2;
             break;
         case 5:
             // Pentagonal numbers
             //number = n * (3 * n - 1) / 2;
        	 root= (1+ Math.sqrt(1+4*3*number*2) )/6;   
             break;
         case 6:
             //Hexagonal numbers
             //  number = n * (2*n - 1);
        	 root=(1 + Math.sqrt(1 + 4*2*number ))/4;
             break;
         case 7:
             //Heptagonal numbers
           //  number = n * (5 * n - 3) / 2;
        	 root= (3 + Math.sqrt(9 + 4*5*number*2))/10;
             break;
         case 8:
             //Octagonal numbers
           //  number = n * (3 * n - 2);
        	 root= (2 + Math.sqrt(4 + 4*3*number));
             break;
     }
		 return root % 1==0;
	}
	 */
}
