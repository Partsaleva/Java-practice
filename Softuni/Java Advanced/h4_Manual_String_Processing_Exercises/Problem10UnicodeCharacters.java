package h4_Manual_String_Processing_Exercises;

public class Problem10UnicodeCharacters {

    public static void main(String[] args) {
        String testString="Hi!";
        for (int i = 0; i < testString.length(); i++) {
            System.out.print(toUnicode(testString.charAt(i)));
        }

    }
    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
