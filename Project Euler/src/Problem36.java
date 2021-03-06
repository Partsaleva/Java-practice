/*The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.
Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
(Please note that the palindromic number, in either base, may not include leading zeros.)*/
public class Problem36 {

    public static void main(String[] args) {
        long sum=0;
        for (int i = 1; i < 1_000_000; i++) {
            if (isDecimalPalindrom(i) && isBinaryPalindrom(i)) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isBinaryPalindrom(long num) {
        String number=Long.toBinaryString(num);
        return checkIfPalindrome(number);     
    }
    
    private static boolean isDecimalPalindrom(long num) {
        String number=Long.toString(num);
        return checkIfPalindrome(number);
        
    }
    
    private static boolean checkIfPalindrome(String number) {
        int size=number.length();
        for (int i = 0; i < size/2; i++) {
            if (number.charAt(i) != number.charAt(size-i-1)) {
                return false;
            }
        }
        return true; 
    }
}
