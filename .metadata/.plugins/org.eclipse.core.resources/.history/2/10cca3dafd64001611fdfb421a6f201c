import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Write a program that extracts words from a string. Words are sequences 
 * of characters that are at least two symbols long and consist only of 
 * English alphabet letters. Use regex.*/
public class Problem5ExtractWords {

    public static void main(String[] args) {
        String text1="Az&76sym&&samo&cvqt&lilav";
        String text2="Shoot18297the1231023dwarves!";
        String text3="1798No(*&Girls)*(09Allowed";
        System.out.println(extractWords(text1));
        System.out.println(extractWords(text2));
        System.out.println(extractWords(text3));
        
    }

    private static String extractWords(String text){
        Pattern p=Pattern.compile("[A-Z][a-z]+|[a-z]+");
        Matcher m=p.matcher(text);
        StringBuilder str=new StringBuilder();
        while (m.find()) {
            str.append(m.group());
            str.append(" ");
        }
        return str.toString();
    }
}
