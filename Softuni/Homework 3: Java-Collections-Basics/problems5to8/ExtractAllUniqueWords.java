package problems5to8;

import java.util.Set;
import java.util.TreeSet;

/*Problem 8. Extract All Unique Words
At the first line at the console you are given a piece of text. 
Extract all words from it and print them in alphabetical order. 
Consider each non-letter character as word separator. 
Take the repeating words only once. Ignore the character casing. 
Print the result words in a single line, separated by spaces*/
public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		String input1="Welcome to SoftUni. Welcome to Java."; //java softuni to welcome
		String input2="What is better: Java SE or Java EE?"; //better ее is java or se what 
		String input3="hello"; //hello
		extractUniqueWords(input1);
		extractUniqueWords(input2);
		extractUniqueWords(input3);
	}

	public static void extractUniqueWords(String str){
		Set<String> set=new TreeSet<>();
		String[] words = str.split("\\W+");
		for (String w : words) {
			set.add(w.toLowerCase());
		}
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
}
