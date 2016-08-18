import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Problem 6.  Starts and Ends With Capital Letter
Write a program that takes as input an array of strings are prints 
only the words that start and end with capital letter. Words are only 
strings that consist of English alphabet letters. Use regex.*/
public class Problem6StartsandEndsWithCapitalLetter {

    public static void main(String[] args) {
        String text1="GoshO blabla NqmaSm1saL KvoStaA"; //GoshO KvoStaA 
        String text2="AZ AK 47 RoBoT noWayouT"; //AZ AK RoBoT 
        String text3="DrakonI Navsekyde"; //DrakonI
        System.out.println(getWords(text1));
        System.out.println(getWords(text2));
        System.out.println(getWords(text3));
        
    }

    private static String getWords(String text){
        Pattern p=Pattern.compile("\\b[A-Z][a-z]*[A-Z]*[a-z]*[A-Z$]\\b");
        Matcher m= p.matcher(text);
        StringBuilder str=new StringBuilder();
        while (m.find()) {
            str.append(m.group());
            str.append(" ");
        }
        return str.toString();
        
    }
}
