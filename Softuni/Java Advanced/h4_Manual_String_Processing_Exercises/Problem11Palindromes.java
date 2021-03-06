package h4_Manual_String_Processing_Exercises;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem11Palindromes {

    public static void main(String[] args) {
        String text="aibohphobia is fear of palindromes ahahaha";
        String[] words=text.split("\\W+");
        Set<String> palindromes=new LinkedHashSet<>();
        for (String str : words) {
            if (isPalindrome(str)) {
                palindromes.add(str);
            }
        }
        System.out.println(palindromes);
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) 
                return false;
        }
        return true;
    }

}
