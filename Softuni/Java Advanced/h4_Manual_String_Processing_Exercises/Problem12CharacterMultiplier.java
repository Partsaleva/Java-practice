package h4_Manual_String_Processing_Exercises;

public class Problem12CharacterMultiplier {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "aaaaa";
        int sum = 0;
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str2.length() < str2.length() ? str2 : str1;
        int smallerLenght = smaller.length();
        for (int i = 0; i < smallerLenght; i++) {
            sum += (int) bigger.charAt(i) * (int) smaller.charAt(i);
        }
        for (int i = smallerLenght + 1; i < bigger.length(); i++) {
            sum += (int) bigger.charAt(i);
        }
        System.out.println(sum);
    }

}
