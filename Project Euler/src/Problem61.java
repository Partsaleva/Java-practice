
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem61 {

	private static class Result{	
		private List<Integer> result=new ArrayList<>();
		private int[] types=new int[]{0,0,0,0,0,1};
		public Result(){			
		}
		@Override
		public String toString() {
			return "Result [result=" + result + ", types=" + Arrays.toString(types) + "]";
		}
		
		
	}
	public static void main(String[] args) {
		Map<Integer, List<Integer>> res = new HashMap<>();
		for (int i = 3; i < 9; i++) {
			List<Integer> list=generateNumbersOfEveryType(i);
			res.put(i,list);
		}
		
		for (Map.Entry<Integer, List<Integer>> entry : res.entrySet()) {
			System.out.println(entry.getKey() +" :"+ entry.getValue());
		}
		
		List<Result> resultLists=new ArrayList<>();
		List<Integer> initList=res.get(8);
				
		for (int i = 0; i < initList.size(); i++) {
			Result r=new Result();
			r.result.add(initList.get(i));
			resultLists.add(r);
		}
		
	
		for (int i = 0; i < resultLists.size(); i++) {
			findNext(resultLists.get(i), res);
		}
		
		System.out.println(resultLists);
		for (int i = 0; i < resultLists.size(); i++) {
			if (resultLists.get(i).result.size()==6) {
				System.out.println(resultLists.get(i));
			}
		}
	//	System.out.println(hasRoot(3, 8256));
		
	}
	
	private static void findNext(Result current, Map<Integer, List<Integer>> res){
		
		for (int j = 0; j < res.size(); j++) {
			List<Integer> mapList=res.get(j+3);
		
			for (int k = 0; k < mapList.size(); k++) {
				if (lastTwoDigits(current.result.get(current.result.size() -1))
						==firstTwoDigits(mapList.get(k)) && current.types[j]==0) {
					current.types[j]=1;
					current.result.add(mapList.get(k));
					break;
				}
				
			}
		}
		
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
					lastTwoDigits(number) > 9){
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
