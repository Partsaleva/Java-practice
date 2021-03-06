package homework3JavaCollectionsBasics.problems1to4;

import java.util.ArrayList;
import java.util.List;

/*Problem 4. Longest Increasing Sequence
Write a program to find all increasing sequences inside an array of integers. 
The integers are given in a single line, separated by a space. 
Print the sequences in the order of their appearance in the input array, 
each at a single line. Separate the sequence elements by a space. 
Find also the longest increasing sequence and print it at the last line. 
If several sequences have the same longest length, print the leftmost of them.*/
public class LongestIncreasingSequence {

	public static void main(String[] args) {
		String pr1="2 3 4 1 50 2 3 4 5";
		String pr2="8 9 9 9 -1 5 2 3";
		String pr3="1 2 3 4 5 6 7 8 9";
		String pr4="5 -1 10 20 3 4";
		String pr5="10 9 8 7 6 5 4 3 2 1";
		print(findAllIncrSeq(pr1));
		print(findAllIncrSeq(pr2));
		print(findAllIncrSeq(pr3));
		print(findAllIncrSeq(pr4));
		print(findAllIncrSeq(pr5));

	}

	private static int toInt(String s){
		return Integer.parseInt(s);
	}
	public static List<List<Integer>> findAllIncrSeq(String input){
		String[] parts=input.split(" ");
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> temp=new ArrayList<>();
		temp.add(toInt(parts[0]));
		for (int i = 1; i < parts.length; i++) {
			if (toInt(parts[i-1])< toInt(parts[i])) {
				temp.add(toInt(parts[i]));
			} else {
				list.add(temp);
				temp=new ArrayList<Integer>();
				temp.add(toInt(parts[i]));				
			}
		}
		list.add(temp);
		return list;
	}
	
	
	public static void print(List<List<Integer>> list){
		List<Integer> longest = new ArrayList<>();
		for (List<Integer> l : list) {
			if(l.size() > longest.size()){
				longest=l;
			}
			for (Integer s : l) {
				System.out.print(s+" ");
			}
			System.out.println();			
		}
		System.out.println("Longest: "+ longest);
		System.out.println();
	}
	
}
