
public class InvertBit {

	//value of number with inverted bits
	public static void main(String[] args) {
		System.out.println(getIntegerComplement(50));

	}

	static int getIntegerComplement(int n) {
		Integer.toString(n, 2);
		String bin=Integer.toString(n, 2);
		String reversed=reverseBits(bin);		
		return Integer.parseInt(reversed,2);
    }

	static String reverseBits(String binaryNum){
		String result="";
		char[] num=new char[binaryNum.length()];
		num = binaryNum.toCharArray();
		for (int i = 0; i < num.length; i++) {
			int j= Character.getNumericValue(num[i]);
			result+=j ^ 1;
		}
		return result;
		
	}
}
