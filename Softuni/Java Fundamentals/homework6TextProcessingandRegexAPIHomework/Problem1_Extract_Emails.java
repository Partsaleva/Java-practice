package homework6TextProcessingandRegexAPIHomework;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Problem 1.  Extract Emails
Write a program to extract all email addresses from given text. 
The text comes at the first input line. Print the emails in 
the output, each at a separate line. Emails are considered 
to be in format <user>@<host>*/
public class Problem1_Extract_Emails {

    public static void main(String[] args) {
        String text1="Please contact us at: support@github.com. ";
        String text2="Just send email to s.miller@mit.edu and j.hopking@york.ac.uk for more information. ";
        String text3="Many users @ SoftUni confuse email addresses. "
                + "We @ Softuni.BG provide high-quality training @ home or @ class. –- steve.parker@softuni.de.  ";
  
        String regex= "\\w+\\.*\\w+[\\.-_]*@\\w+\\.*\\w+\\.\\w+";
        Pattern pattern=Pattern.compile(regex);
        
        Matcher m=pattern.matcher(text1);
        Matcher m2=pattern.matcher(text2);
        Matcher m3=pattern.matcher(text3);
        while (m.find()) {
            System.out.println(m.group());
        }
        while (m2.find()) {
            System.out.println(m2.group());
        }
        while (m3.find()) {
            System.out.println(m3.group());
        }
    }

}
