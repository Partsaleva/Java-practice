package homework3JavaCollectionsBasics.problems1to4;

import java.util.List;

/*Problem 3. Largest Sequence of Equal Strings
Write a program that enters an array of strings and finds in it the 
largest sequence of equal elements. If several sequences have the same 
longest length, print the leftmost of them. The input strings are given 
as a single line, separated by a space*/

public class LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		String s1="hi yes yes yes bye";
		String s2="1 1 2 2 3 3 4 4 5 5";
		String s3="a b b xxx c c c";
		String s4="hi hi hi hi hi";
		String s5="hello";
		findLargestSequence(s1);
		findLargestSequence(s2);
		findLargestSequence(s3);
		findLargestSequence(s4);
		findLargestSequence(s5);

	}

	public static void findLargestSequence(String str){
		SequencesOfEqualStrings ses=new SequencesOfEqualStrings();
		List<List<String>> list=ses.equalStrings(str);
		int max=0;
		int currentMax=0;
		List<String> elem=null;
		for (int i = 0; i < list.size(); i++) {
			currentMax=list.get(i).size();
			if(currentMax>max){
				max=currentMax;
				elem=list.get(i);
			}
			currentMax=0;
		}
		
		System.out.println(elem);
	}
}
