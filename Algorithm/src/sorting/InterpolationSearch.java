package sorting;

import java.util.Arrays;
import java.util.List;

public class InterpolationSearch {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,7,24,34,56,57);
		System.out.println(search(3,list));
		System.out.println(search(30,list));

	}

	public static boolean search(int x, List<Integer> list){
		int left=0;
		int right=list.size()-1;
		
		while(left<= right){
			
			if (list.get(left)==list.get(right)) {
				if (list.get(left)==x) {
					return true;
				} else {
					return false;
				}
			} 
			
			int c = (x-left)/(right-left);
			if (c < 0 || c > 1) {
				return false;
			}
			
			int mid=left + c * (right -left);
			
			if (x < mid) {
				right=mid - 1;
			} else if(x > mid) {
				left=mid + 1;
			}else{
				return true;
			}
			
		}
		return false;
		
	}
}
