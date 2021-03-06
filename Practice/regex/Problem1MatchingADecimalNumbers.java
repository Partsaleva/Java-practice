import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1MatchingADecimalNumbers {

    public static void main(String[] args) {
        List<String> numbers=new ArrayList<>(Arrays.asList("14529","-255.34","128","1.9e10","123,340.00","720p"));
        Pattern p= Pattern.compile("^-?\\d+(,\\d+)*(\\.\\d+(e\\d+)?)?$");
        Matcher m=null;
        for (String str : numbers) {
            m=p.matcher(str);
            if (m.find()) {
                System.out.println(m.group()); 
            }           
        }       
    }
}
