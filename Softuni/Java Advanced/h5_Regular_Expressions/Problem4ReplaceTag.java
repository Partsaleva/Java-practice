package h5_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4ReplaceTag {

    public static void main(String[] args) {
        String line="<a href=\"http://softuni.bg\">SoftUni</a>";
        Pattern p=Pattern.compile("(<|\\/)(a)(>| )");
        Matcher m=p.matcher(line);
        while(m.find()){
            line=line.replace(m.group(2),"URL");
        }
        System.out.println(line);
    }

}
