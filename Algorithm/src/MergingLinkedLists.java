import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergingLinkedLists {

	public static void main(String[] args) {
		List<Integer> list1=new LinkedList<>(Arrays.asList(1, 2,3 ,4 ,5,6,7));
		List<Integer> list2=new LinkedList<>(Arrays.asList(7,1,5,6,7));
		check(list1, list2);

	}

	public static void check(List<Integer> list1,List<Integer> list2){
		if(list1.get(list1.size()-1)==list2.get(list2.size()-1)){
			System.out.println("Lists are merged");
		}
		int firstCommon = 0;
		int difference=Math.abs(list1.size()-list2.size());
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i+difference)== list2.get(i)) {
				firstCommon=list2.get(i);
				break;
			}
		}
		System.out.println("First common element is: " +firstCommon);
	}
	
}
