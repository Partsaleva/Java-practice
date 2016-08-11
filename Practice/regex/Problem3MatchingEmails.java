import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem3MatchingEmails {
    public static void main(String[] args) {
        List<String> emailList=Arrays.asList("tom@hogwarts.com", "tom.riddle@hogwarts.com", 
                "tom.riddle+regexone@hogwarts.com", "tom@hogwarts.eu.com", "potter@hogwarts.com", 
                "harry@hogwarts.com", "hermione+regexone@hogwarts.com");
        Pattern p=Pattern.compile("[a-z]+\\.?[a-z]*\\+?[a-z]*");
        Matcher m=null;
        for(String str : emailList){
            m=p.matcher(str);
            if (m.find()) {
                System.out.println(m.group());
            }
        }
    }
    
}
