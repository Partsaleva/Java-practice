package homework1JavaSyntax.task7and8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizeNumbers {

	public static void main(String[] args) {
		int low = 10;
		int high = 20;
		System.out.println(randomizeNumbers(low,high));
		
	}

	static List<Integer> randomizeNumbers(int low, int high){
		List<Integer>numbers=new ArrayList<>();
		Random rand=new Random();
		
		for (int i = low; i <= high; i++) {
			numbers.add(i);
		}
	
		for (int i = 0; i < numbers.size(); i++) {
		    int change = i + rand.nextInt(numbers.size()- i);
		    swap(numbers, i, change);
		}
		
		return numbers;
		
	}

	private static void swap(List<Integer> a, int i, int change) {
		int helper = a.get(i);
	    a.set(i, a.get(change));
	    a.set(change, helper);		
	}
	
}
