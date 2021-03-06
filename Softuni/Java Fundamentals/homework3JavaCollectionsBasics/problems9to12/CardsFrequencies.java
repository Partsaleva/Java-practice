package homework3JavaCollectionsBasics.problems9to12;

import java.util.LinkedHashMap;
import java.util.Map;

/*Problem 10. Cards Frequencies
We are given a sequence of N playing cards from a standard deck. 
The input consists of several cards (face + suit), separated by a space. 
Write a program to calculate and print at the console the frequency of 
each card face in format "card_face -> frequency". The frequency is 
calculated by the formula appearances / N and is expressed in percentages 
with exactly 2 digits after the decimal point. The card faces with their 
frequency should be printed in the order of the card face's first appearance in the input. 
The same card can appear multiple times in the input, but it's face should be listed only once in the output.*/
public class CardsFrequencies {

	public static void main(String[] args) {
		String input="8♥ 2♣ 4♦ 10♦ J♥ A♠ K♦ 10♥ K♠ K♦";
		String input2="J♥ 2♣ 2♦ 2♥ 2♦ 2♠ 2♦ J♥ 2♠";
		String input3="10♣ 10♥";
		printFrequencies(input);
		printFrequencies(input2);
		printFrequencies(input3);
		

	}

	public static void printFrequencies(String str){
		Map<String, Integer> freq= new LinkedHashMap<>();
		int count=1;
		str = str.replaceAll("\\s+","");
		String[] cards=str.split("[♥♣♦♠]");
		for (String s : cards) {
			if (freq.containsKey(s)) {
				count=freq.get(s);
				freq.put(s, count+1);
			}else {
				freq.put(s, count);
			}
		}
		
		for(Map.Entry<String, Integer> entry : freq.entrySet()){
			double frequence=((double)entry.getValue()/cards.length)*100;
			System.out.printf(" %s -> %.2f ",entry.getKey(),frequence);
		}
		System.out.println();
	}
}
