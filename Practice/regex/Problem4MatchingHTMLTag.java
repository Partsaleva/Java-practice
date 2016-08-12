import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4MatchingHTMLTag {

    public static void main(String[] args) {
       List<String> list=Arrays.asList("<a>This is a link</a>", "<a href='http://regexone.com'>Link</a>",
               "<div class='test_style'>Test</div>","   <div>Hello <span>world</span></div>");

       Pattern p=Pattern.compile("<(\\w+)");
       Matcher m=null;
       for(String str : list){
           m=p.matcher(str);
           if (m.find()) {
               System.out.println(m.group());
           }
       }
    }

}
