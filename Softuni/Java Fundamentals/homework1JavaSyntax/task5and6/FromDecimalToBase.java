package homework1JavaSyntax.task5and6;

public class FromDecimalToBase {

	public static void main(String[] args) {
		int number=1000;
		int base=7;
		System.out.println(fromDecimalToBase(number,base));
	}

	private static String fromDecimalToBase(int number, int base) {
		StringBuilder result = new StringBuilder();
		int remainder = 0;
		while (number != 0) {
			remainder = number % base;
			number = number / base;
			result.append(remainder);
			remainder = 0;
		}
		return result.reverse().toString();
	}
}
