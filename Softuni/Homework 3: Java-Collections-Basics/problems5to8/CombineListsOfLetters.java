package problems5to8;
/*Problem 7. Combine Lists of Letters
Write a program that reads two lists of letters l1 and l2 
and combines them: appends all letters c from l2 to the end 
of l1, but only when c does not appear in l1. Print the obtained 
combined list. All lists are given as sequence of letters separated
 by a single space, each at a separate line. Use ArrayList<Character>
  of chars to keep the input and output lists.*/
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
