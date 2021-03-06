package other;

public class RemoveDuplChar {

	public static void main(String[] args) {
		System.out.println(removeDuplicatesFromString("aebbbcdee"));

	}

	public static String removeDuplicatesFromString(String input) {
		if (input == null || input.length()< 2) {
			return input; 
		}
		boolean[] ASCII = new boolean[127]; 
		char[] characters = input.toCharArray(); 
		ASCII[input.charAt(0)] = true; 
		int dupIndex = 1; 
		for (int i = 1; i< input.length(); i++) { 
			if (!ASCII[input.charAt(i)]) { 
				characters[dupIndex] = characters[i];
				++dupIndex; 
				ASCII[characters[i]] = true; 
			} else { 
				characters[dupIndex] = 0; 
				++dupIndex; 
			} 
		}
		return toUniqueString(characters);
	}

	public static String toUniqueString(char[] letters) { 
		StringBuilder sb = new StringBuilder(letters.length); 
		for (char c : letters) { 
			if (c != 0) { 
				sb.append(c);
			} 
		} 
		return sb.toString(); 
	}

}
