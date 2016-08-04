import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Problem 3. Count Specified Word
Write a program to find how many times a word appears in given text. 
The text is given at the first input line. The target word is given 
at the second input line. The output is an integer number. Please 
ignore the character casing. Consider that any non-letter character is a word separator.*/
public class Problem3CountSpecifiedWord {

    public static void main(String[] args) {
        String text1="Welcome to the Software University (SoftUni)! Welcome to programming.";
        String text2="I am coming...";
        String text3="It's OK, I'm in.";
        String text4="Java is a set of several computer software "
                + "products and specifications from Oracle Corporation "
                + "that provides a system for developing application software "
                + "and deploying it in a cross-platform computing environment. "
                + "Java is used in a wide variety of computing platforms from "
                + "embedded devices and mobile phones on the low end, to enterprise "
                + "servers and supercomputers on the high end.";

      String word="welcome";
      System.out.println(findWord(text1, word));      
      word="hello";
      System.out.println(findWord(text2, word));      
      word="\\W+ i\\W+";
      System.out.println(findWord(text3, word));
      word=" is ";
      System.out.println(findWord(text4, word));
    }

    private static int findWord(String text, String word){
        int count =0;
        Pattern p=Pattern.compile(word.toLowerCase());
        Matcher m=p.matcher(text.toLowerCase());
        while (m.find()) {
            count++;
        }
        return count;
    }
}
