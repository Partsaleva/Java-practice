/*A palindromic number reads the same both ways. The largest palindrome
  made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/
public class Problem04 {

	public static void main(String[] args) {
		int first=998;
		int palindrome=0;
		boolean found=false;
		while (!found) {
			first--;	
			for (int i = 999; i > 99; i--) {			
				palindrome=createPalindrome(first);
				
				if (palindrome /i > 999) {
					break;
				}
				if (palindrome % i == 0) {
					found=true;
					System.out.println(palindrome);
					break;
				}
			}
		}

	}

	private static int createPalindrome(int firstHalf) {
		String secondHalf= new StringBuilder(Integer.toString(firstHalf)).reverse().toString();
		return Integer.parseInt(Integer.toString(firstHalf)+secondHalf);
	}

}
