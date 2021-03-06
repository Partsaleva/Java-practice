import java.util.HashMap;
import java.util.Map;

/*If the numbers 1 to 5 are written out in words: one, two, three, four, 
 five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written 
out in words, how many letters would be used?*/
public class Problem17 {

	//map with numbers and their length written out in words
	private Map<Integer,Integer> numbers=new HashMap<>();
	
	public static void main(String[] args) {
		Problem17 nums=new Problem17();
		nums.fillMap();
		System.out.println(nums.countLengthOfWords());

	}

	public int countLengthOfWords(){
		int oneToTen=0;
		// 1-9
		for (int i = 1; i < 10; i++) {
			oneToTen+= numbers.get(i);
		}
			
		// 10-19 	
		int tenToNineteen=0;
		for (int i = 10; i < 20; i++) {
			tenToNineteen+= numbers.get(i);
		}
	
		// 20..99
		int twentyTo99=0;
		for (int i = 2; i < 10; i++) {
			twentyTo99+=numbers.get(i*10);
		}
		twentyTo99= 10*twentyTo99 + 8*oneToTen;
		
		int oneTo99=twentyTo99 +tenToNineteen +oneToTen;
		int hundreds= 900 * numbers.get(100);
		int and= 9*99*3; //and
		
		int result=100*oneToTen +10*oneTo99 + hundreds +and +numbers.get(1000);
		return result;
		
	}
	private void fillMap(){
		numbers.put(1, 3);
		numbers.put(2, 3);
		numbers.put(3, 5);
		numbers.put(4, 4);
		numbers.put(5, 4);
		numbers.put(6, 3);
		numbers.put(7, 5);
		numbers.put(8, 5);
		numbers.put(9, 4);
		numbers.put(10, 3);
		
		numbers.put(11, 6);
		numbers.put(12, 6);
		numbers.put(13, 8);
		numbers.put(14, 8);
		numbers.put(15, 7);
		numbers.put(16, 7);
		numbers.put(17, 9);
		numbers.put(18, 8);
		numbers.put(19, 8);
		
		numbers.put(20, 6);		
		numbers.put(30, 6);
		numbers.put(40, 5);
		numbers.put(50, 5);
		numbers.put(60, 5);
		numbers.put(70, 7);
		numbers.put(80, 6);
		numbers.put(90, 6);
		numbers.put(100, 7);
		numbers.put(1000, 11);
	}

	
}
