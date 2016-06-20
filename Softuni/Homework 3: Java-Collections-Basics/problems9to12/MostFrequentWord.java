package problems9to12;

import java.util.Map;
import java.util.TreeMap;

/*Problem 9. Most Frequent Word
Write a program to find the most frequent word in a text and print it, 
as well as how many times it appears in format "word -> count". 
Consider any non-letter character as a word separator. Ignore the character casing. 
If several words have the same maximal frequency, print all of them in alphabetical order*/
public class MostFrequentWord {

	public static void main(String[] args) {
		String input1="in the middle of the night"; //the -> 2 times
		String input2="Welcome to SoftUni. Welcome to Java. Welcome everyone."; //welcome -> 3 times 
		String input3="Hello my friend, hello my darling. "
				+ "Come on, come here. Welcome, welcome darling.";   //come -> 2 times 
																	//darling -> 2 times
																	//hello -> 2 times
																	//my -> 2 times
																	//welcome -> 2 times
		findMostFrequentWord(input1);
		findMostFrequentWord(input2);
		findMostFrequentWord(input3);

	}

	private static void findMostFrequentWord(String str){
		String[] words=str.split("\\W+");
		TreeMap<String, Integer> map= new TreeMap<>();
	
		for (String s : words) {
			s=s.toLowerCase();
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				int count=map.get(s);
				map.put(s, count+1);
			}
		}
		
		int max= map.get(map.lastKey());
		for (Map.Entry<String, Integer> entry : map.entrySet()){
			if (entry.getValue() == max) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}		    
		}
		System.out.println();
	}
}
