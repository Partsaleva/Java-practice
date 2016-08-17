import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*In the lines below, the last string with only one z isn't what we 
 * would consider a proper spelling of the slang "wazzup?". 
 * Try writing a pattern that matches only the first two spellings 
 * by using the curly brace notation above.*/
public class Lesson6CatchingSomeZzzs {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("wazzzzzup",
                "wazzzup",
                "wazup");

        Pattern p=Pattern.compile("waz{3,5}up");
        Matcher m=null;
        for (String str : list) {
            m=p.matcher(str);
            while (m.find()) {
                System.out.println(m.group());
            }
        }

    }

}
