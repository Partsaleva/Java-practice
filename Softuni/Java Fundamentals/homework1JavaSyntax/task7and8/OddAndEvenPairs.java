package homework1JavaSyntax.task7and8;

import java.util.ArrayList;
import java.util.List;

public class OddAndEvenPairs {

	public static void main(String[] args) {
		String test1="1 2 3 4";
		String test2="2 8 11 15 3 2";
		String test3="1 8 11 1 2";
		printDataForPairs(test1);
		printDataForPairs(test2);
		printDataForPairs(test3);

	}

	private static void printDataForPairs(String str){
		//split string by space
		String[] strArr=str.split(" ");
		List<Integer> list=new ArrayList<>();
		//fill list with parsed to int numbers from string array
		for (String s : strArr) {
			list.add(Integer.parseInt(s));
		}
		//check if size is valid
		if(!isEven(list.size())){
			System.out.println("Invalid length");
		}
		else{
			
			for (int i = 0; i < list.size()-1; i=i+2) {
				
				check ( list.get(i), list.get(i+1) );
			}
		}
		System.out.println();
	}
	
	private static void check(int a, int b){
		if(isEven(a) && isEven(b)){
			System.out.println(a +", "+b+" -> both are even");
		} 
		else if(!isEven(a) && !isEven(b)){
			System.out.println(a +", "+b+" -> both are odd");
		}
		else{
			System.out.println(a +", "+b+" -> different");
		}
	}
	
	private static boolean isEven (int num) {
        return (num % 2) == 0;
    }
	
}
