package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,8,1,14,25,13);
		System.out.println(countSort(list,25));

	}

	public static List<Integer> countSort(List<Integer> list, int max) {
		int[] cnt=new int[max+1];
		List<Integer> sortedList=new ArrayList<>();

		for (int i = 0; i < cnt.length; i++){
			cnt[i] = 0;
		}
		
		for (int i = 0; i < list.size(); i++) {
			cnt[list.get(i)]++;	
		}
	
		    
		for (int i = 0; i < cnt.length; i++) {
			int j=cnt[i];
			while(j!=0){
				sortedList.add(i);
				j--;
			}
		}

		return sortedList;
	}
}
