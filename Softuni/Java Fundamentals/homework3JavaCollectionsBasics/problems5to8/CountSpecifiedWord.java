package homework3JavaCollectionsBasics.problems5to8;

import java.util.HashMap;
import java.util.Map;

/*Problem 6. Count Specified Word
Write a program to find how many times a word appears in given text. 
The text is given at the first input line. The target word is given 
at the second input line. The output is an integer number. Please ignore
 the character casing. 
 Consider that any non-letter character is a word separator.*/

public class CountSpecifiedWord {

	public static void main(String[] args) {
		String input1 = "Welcome to the Software University (SoftUni)! "
				+ "Welcome to programming."; //welcome 2
		String input2 = "I am coming...";//hello 0
		String input3 = "It's OK, I'm in."; // i 1
		String input4 = "Java is a set of several computer software products and "
				+ "specifications from Oracle Corporation that provides a system "
				+ "for developing application software and deploying it in a "
				+ "cross-platform computing environment. Java is used in a wide"
				+ " variety of computing platforms from embedded devices and mobile"
				+ " phones on the low end, to enterprise servers and "
				+ "supercomputers on the high end."; //is 2
		System.out.println(countWordAppearance("welcome", input1));
		System.out.println(countWordAppearance("hello", input2));
		System.out.println(countWordAppearance("i", input3));
		System.out.println(countWordAppearance("is", input4));

	}

	public static int countWordAppearance(String word, String input){
		String[] words = input.split("\\W+");
		Map<String, Integer> wordsMap=new HashMap<>();
		for (String w : words) {
			w=w.toLowerCase();
			if (!wordsMap.containsKey(w)) {
				wordsMap.put(w, 1);
			} else {
				int count=wordsMap.get(w);
				wordsMap.put(w, count+1);
			}
		}
		if (wordsMap.containsKey(word.toLowerCase())) {
			return wordsMap.get(word);
		}
		return 0;		
	}
}
