package h5_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6SentenceExtractor {

    public static void main(String[] args) {
        String text="This is my cat! And this is my dog. We happily live in Paris "
                + "– the most beautiful city in the world! Isn’t it great? Well it is :)";
        String word="is";
        Pattern p=Pattern.compile("[A-Z][A-Za-z,\\s]+"+word+"[A-Za-z,\\s]+[.?!]");
        Matcher m=p.matcher(text);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
