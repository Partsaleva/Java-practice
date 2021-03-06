import java.util.HashSet;
import java.util.Set;

public class CheckRepeating {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, -5, 6, 3, -1, 4, -2, 3, 3, -2, 3};
		int[] arr2 = {1, 2, -5, 6, 3};
		int[] arr3 = {1, 2, 6, 3, 4, -1, -2, 3};
		System.out.println(checkForRepeatedNumber(arr1));
		System.out.println(checkForRepeatedNumber(arr2));
		System.out.println(checkForRepeatedNumber(arr3));
		
	}

	public static boolean checkForRepeatedNumber(int [] arr){
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);			
		}
		return arr.length == set.size();
	}
	
}
