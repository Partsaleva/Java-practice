package problems5to8;

import java.util.ArrayList;
import java.util.Arrays;


public class CombineListsOfLetters {

	public static void main(String[] args) {
		ArrayList <Character> l1= new ArrayList<>(Arrays.asList('h','e','l','l','o'));
		ArrayList <Character> l2=  new ArrayList<>(Arrays.asList('l','o','w'));
		System.out.println(combineLists(l1, l2));
		
		l1= new ArrayList<>(Arrays.asList('a','b','c','d'));
		l2=  new ArrayList<>(Arrays.asList('x','y','z'));
		System.out.println(combineLists(l1, l2));
		
		l1= new ArrayList<>(Arrays.asList('a','b','a'));
		l2=  new ArrayList<>(Arrays.asList('b','a','b','a'));
		System.out.println(combineLists(l1, l2));
	
	}

	public static ArrayList<Character> combineLists(ArrayList <Character> l1,ArrayList <Character> l2){
		
		for (Character ch : l2) {
			if (!l1.contains(ch)) {
				l1.add(ch);
			}
		}
		return l1;		
	}
}
