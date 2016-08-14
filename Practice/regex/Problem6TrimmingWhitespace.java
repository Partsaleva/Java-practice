import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6TrimmingWhitespace {

    public static void main(String[] args) {
        String str1="           The quick brown fox...  ";
        String str2="      jumped over the lazy dog.";
        Pattern p=Pattern.compile("\\w+");
        Matcher m=p.matcher(str1);
        String result="";
        while (m.find()) {
            result+=m.group()+ " ";
        }
        System.out.println(result);
         m=p.matcher(str2);
         while(m.find()) {
             result+=m.group()+" ";
         }
         System.out.println(result);
    }

}
