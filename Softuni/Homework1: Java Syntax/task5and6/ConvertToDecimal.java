package task5and6;

public class ConvertToDecimal {

	public static void main(String[] args) {
		int num=2626; int base=7;
		System.out.println(convertToDecimal(num, base));

	}

	private static int convertToDecimal(int number, int base){
		StringBuilder num=new StringBuilder();
		num.append(number).reverse();
		int result=0;
		for (int i = 0; i < num.length(); i++) {	
			int n=num.charAt(i) - '0'; 
			int p=(int) Math.pow(base, i) ;
			result+=(n*p);			
		}			
		return result;		
	}
}
