package task3and4;


public class FormattingNumbers {

	public static void main(String[] args) {
		/*
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		formatNumbers(a, b, c);
		*/
		formatNumbers(30, 4, 5);

	}

	public static void formatNumbers(int a, double b, double c){
		String hex=Integer.toHexString(a);
		System.out.println(hex);
		int binary=Integer.parseInt(Integer.toBinaryString(a));
		System.out.println(binary);
		System.out.print(String.format("|%-10s|%010d|%10.2f|%-10.3f|", hex,binary, b, c));
	}
}
