package homework3JavaCollectionsBasics.problems5to8;
/*Problem 5. Count All Words
Write a program to count the number of words in given sentence. 
Use any non-letter character as word separator.*/

public class CountAllWords {

	public static void main(String[] args) {
		String input1 = "Welcome to the Software University (SoftUni)!";
		String input2 = "I am coming...";
		String input3 = "It's OK, I'm in.";
		String input4 = "Java is a set of several computer software products and "
				+ "specifications from Oracle Corporation that provides a system "
				+ "for developing application software and deploying it in a "
				+ "cross-platform computing environment. Java is used in a wide"
				+ " variety of computing platforms from embedded devices and mobile"
				+ " phones on the low end, to enterprise servers and supercomputers on the high end.";

		System.out.println(countWords(input1));
		System.out.println(countWords(input2));
		System.out.println(countWords(input3));
		System.out.println(countWords(input4));

	}

	private static int countWords(String input) {
		String[] words= input.split("\\W+");
		return words.length;		
	}

	
}
