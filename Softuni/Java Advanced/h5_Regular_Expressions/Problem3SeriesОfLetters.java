package h5_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3SeriesОfLetters {

    public static void main(String[] args) {
        String line="Welccommee";
        Pattern p=Pattern.compile("([a-zA-Z])\\1");
        Matcher m=p.matcher(line);
        while(m.find()){
            line=line.replace(m.group(), m.group(1));
        }
        System.out.println(line);
    }
}
