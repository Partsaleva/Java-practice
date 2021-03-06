package homework1JavaSyntax.task910and11;

public class CharacterMultiplier {

	public static void main(String[] args) {
		int sum=getCodeOfStrings("Gosho", "Pesho");
		int sum2=getCodeOfStrings("123", "522");
		int sum3=getCodeOfStrings("a", "aaaa");
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);

	}

	public static int getCodeOfStrings(String first, String second){
		String bigger=bigger(first, second);
		String smaller=smaller(first, second);
		int sum=0;
		
		for (int i = 0; i < smaller.length(); i++) {
			sum+=( bigger.charAt(i) * smaller.charAt(i));
		}
		for (int i = smaller.length(); i < bigger.length(); i++) {
			sum+=bigger.charAt(i);
		}
		
		return sum;		
	}
	
	private static String bigger(String a, String b){
		//bigger or equal
		return (a.length() >= b.length()) ? a : b;
	}
	
	private static String smaller(String a, String b){
		return (a.length() < b.length()) ? a : b;
	}
}
