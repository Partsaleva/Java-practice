package homework6TextProcessingandRegexAPIHomework;
import java.util.HashMap;
import java.util.Map;

/*Problem 7.  ***Magic exchangeable words
Write a method that takes as input two strings of equal length, 
and returns Boolean if they are exchangeable or not. Exchangeable 
are words where the characters in the first string can be replaced 
to get the second string. Example: egg and add are exchangeable, 
but aabbccbb and nnooppzz are not. (First bb corresponds to oo, 
but second bb corresponds to zz)*/
public class Problem7MagicExchangeableWords {

    public static void main(String[] args) {
        String str1="gosho"; String str2="hapka";
        System.out.println(areExchangeable(str1, str2));
        str1="aabbaa"; str2="ddeedd";
        System.out.println(areExchangeable(str1, str2));
        str1="foo"; str2="bar";
        System.out.println(areExchangeable(str1, str2));
    }

    private static boolean areExchangeable(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> letters=new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            letters.put(str1.charAt(i), str2.charAt(i));
        }
        String temp="";
        for (int i = 0; i < str1.length(); i++) {
            temp+=letters.get(str1.charAt(i));
        }
        if (str2.equals(temp)) {
            return true; 
        }
        return false;    
    }
}
