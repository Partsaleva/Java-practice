import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*we are going to use actual output from an Android adb debugging session. 
 *Your goal is to use any regular expression techniques that we've learned 
 *so far to extract the filename, method name and line number of line of 
 *the stack trace (they follow the form "at package.class.methodname(filename:linenumber)").*/
public class Problem7ExtractingInformationFromALogFile {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("W/dalvikvm( 1553): threadid=1: uncaught exception",
                "E/( 1553): FATAL EXCEPTION: main",
                "E/( 1553): java.lang.StringIndexOutOfBoundsException",
                "   E/( 1553):   at widget.List.makeView(ListView.java:1727)",
                "   E/( 1553):   at widget.List.fillDown(ListView.java:652)",
                "   E/( 1553):   at widget.List.fillFrom(ListView.java:709)");
        
        Pattern p=Pattern.compile("(\\w+)\\((\\w+\\.\\w+):(\\d+)");
        Matcher m=null;
        for (String str : list) {
            m=p.matcher(str);
            while (m.find()) {
                System.out.println(m.group());
            }
        }

    }

}
