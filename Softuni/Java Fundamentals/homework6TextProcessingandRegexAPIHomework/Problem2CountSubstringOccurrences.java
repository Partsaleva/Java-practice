package homework6TextProcessingandRegexAPIHomework;
/*Problem 2. Count Substring Occurrences
Write a program to find how many times given string appears in given 
text as substring. The text is given at the first input line. 
The search string is given at the second input line. The output is an 
integer number. Please ignore the character casing*/
public class Problem2CountSubstringOccurrences {

    public static void main(String[] args) {
        String text1="Welcome to the Software University (SoftUni)! " //wel 4
                + "Welcome to programming. Programming is wellness for developers, said Maxwell.";
        String text2="aaaaaa"; //aa 5
        String text3="ababa caba"; //aba 3
        String text4="Welcome to SoftUni"; //Java 0
        
        int count=0;
        String word="wel".toLowerCase();
        String input=text1.toLowerCase();
        int index = input.indexOf(word);
        while (index != -1) {
            index = input.indexOf(word, index + 1);
            count++;
        }
        System.out.println(count);
        count=0;
        
        word="aa";
        input=text2.toLowerCase();
        index = input.indexOf(word);
        count = 0;
        while (index != -1) {
            index = input.indexOf(word, index + 1);
            count++;
        }
        System.out.println(count);
        count=0;
        
        word="aba";
        input=text3.toLowerCase();
        index = input.indexOf(word);
        count = 0;
        while (index != -1) {
            index = input.indexOf(word, index + 1);
            count++;
        }
        System.out.println(count);
        count=0;
        
        word="Java".toLowerCase();
        input=text4.toLowerCase();
        index = input.indexOf(word);
        count = 0;
        while (index != -1) {
            index = input.indexOf(word, index + 1);
            count++;
        }
        System.out.println(count);
    }

}
