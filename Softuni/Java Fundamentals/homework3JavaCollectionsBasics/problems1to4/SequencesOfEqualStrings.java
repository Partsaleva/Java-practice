package homework3JavaCollectionsBasics.problems1to4;

import java.util.ArrayList;
import java.util.List;

/*Problem 2. Sequences of Equal Strings
Write a program that enters an array of strings and finds in it all sequences 
of equal elements. The input strings are given as a single line, separated by a space.*/
public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		SequencesOfEqualStrings ses=new SequencesOfEqualStrings();
		String str1="hi yes yes yes bye";
		String str2="1 1 2 2 3 3 4 4 5 5";
		String str3="a b b xxx c c c";
		ses.print(ses.equalStrings(str1));
		ses.print(ses.equalStrings(str2));
		ses.print(ses.equalStrings(str3));
		

	}

	public List<List<String>> equalStrings(String str){
		String[] words=str.split(" ");
		List<List<String>> list=new ArrayList<>();
		List<String> a=new ArrayList<>();
		
		for (int i = 0; i<words.length; i++) {
			if(a.size()==0){
				a.add(words[i]);
			}else{
				if(a.get(a.size()-1).equals(words[i])){
					a.add(words[i]);
				}else{
					list.add(a);
					a=new ArrayList<>();
					a.add(words[i]);
				}	
			}
		}
		list.add(a);
		return list;
	}
	
	public void print (List<List<String>> list){
		for (List<String> l : list) {
			for (String s : l) {
				System.out.print(s+" ");
			}
			System.out.println();			
		}
		System.out.println();
	}
}
