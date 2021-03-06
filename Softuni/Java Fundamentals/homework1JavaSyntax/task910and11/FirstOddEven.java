package homework1JavaSyntax.task910and11;

import java.util.ArrayList;
import java.util.List;

public class FirstOddEven {

	public static void main(String[] args) {
		String numbers = "1 2 3 4 5";
		String command = "Get 3 odd";
		
		String numbers2 = "11 6 2 8 1 0";
		String command2=  "Get 2 even";

		getFirstOddOrEvenElements(numbers,command);
		getFirstOddOrEvenElements(numbers2,command2);
	}

	private static void getFirstOddOrEvenElements(String numbers,String command){
		String[] parts=numbers.split(" ");
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < parts.length; i++) {
			list.add(Integer.parseInt(parts[i]));
		}
		
		String[] commands=command.split(" ");
		int countOfNums=Integer.parseInt(commands[1]);
		String type=commands[2];
		
		if (type.equals("even")) {
			searchEvens(list,countOfNums);
		}
		else{
			searchOdds(list,countOfNums);
		}
		System.out.println();
	}

	private static void searchOdds(List<Integer> list, int countOfNums) {
		int count=countOfNums;
		for (int i = 0; i < list.size(); i++) {
			if (count==0) {
				break;
			}
			if (!isEven(list.get(i))) {
				System.out.print(list.get(i)+" ");
				count--;
			}
		}
		
	}

	private static boolean isEven(Integer i) {
		return i % 2 == 0;
	}

	private static void searchEvens(List<Integer> list, int countOfNums) {
		int count=countOfNums;
		for (int i = 0; i < list.size(); i++) {
			if (count==0) {
				break;
			}
			if (isEven(list.get(i))) {
				System.out.print(list.get(i) + " ");
				count--;
			}
		}
		
	}
	
	
}
