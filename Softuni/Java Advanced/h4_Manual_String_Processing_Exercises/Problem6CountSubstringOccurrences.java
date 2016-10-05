package h4_Manual_String_Processing_Exercises;

public class Problem6CountSubstringOccurrences {

    public static void main(String[] args) {
        String text="Welcome to the Software University (SoftUni)! Welcome to programming. Programming is wellness for developers, said Maxwell.";
        System.out.println(countSubstringOccurrences(text, "wel"));
        System.out.println(countSubstringOccurrences("aaaaaa", "aa"));
    }

    private static int countSubstringOccurrences(String text, String word) {
        String input=text.toLowerCase();
        int index = input.indexOf(word);
        int count=0;
        while (index!=-1) {
            index = input.indexOf(word, index + 1);
            count++;
        }
        return count;
    }

}
