package h4_Manual_String_Processing_Exercises;

import java.util.HashMap;
import java.util.Map;

public class Problem13MagicExchangeableWords {

    public static void main(String[] args) {
        System.out.println(areExchangeable("gosho", "hapka"));
        System.out.println(areExchangeable("aabbaa", "ddeedd"));
        System.out.println(areExchangeable("foo", "bar"));
        System.out.println(areExchangeable("Clint", "Eastwood"));
        System.out.println(areExchangeable("Clint", "Eastwaat"));

    }

    public static boolean areExchangeable(String str1, String str2) {
        Map<Character, Character> map = new HashMap<>();
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str2.length() < str2.length() ? str2 : str1;
        map.put(smaller.charAt(0), bigger.charAt(0));
        int smallerLenght = smaller.length();
        for (int i = 1; i < smallerLenght; i++) {
            if (!map.containsKey(smaller.charAt(i))) {
                map.put(smaller.charAt(i), bigger.charAt(i));
            } else {
                if (map.get(smaller.charAt(i)) != bigger.charAt(i))
                    return false;
            }
        }
        for (int i = smallerLenght + 1; i < bigger.length(); i++) {
            boolean found = false;
            for (Map.Entry<Character, Character> entry : map.entrySet()) {
                if (entry.getValue() == bigger.charAt(i))
                    found = true;
            }
            if (!found) return false;
        }
        return true;
    }
}
