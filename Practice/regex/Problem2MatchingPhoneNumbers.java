import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*Below are a few phone numbers that you might encounter when using real data, 
 * write a single regular expressions that matches the number and captures the proper area code.*/
public class Problem2MatchingPhoneNumbers {

    public static void main(String[] args) {
        List<String> numbers=Arrays.asList("415-555-1234", "650-555-2345", "(416)555-3456", 
                "202 555 4567", "4035555678", "1 416 555 9292");
        Pattern p=Pattern.compile("(415)|(650)|(416)|(202)|(403)"); 
        Matcher m=null;
        for (String num : numbers) {
            m=p.matcher(num);
            if (m.find()) {
                System.out.println(num);
            }
        }
    }
}
