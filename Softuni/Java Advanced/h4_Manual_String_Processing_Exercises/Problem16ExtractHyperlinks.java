package h4_Manual_String_Processing_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem16ExtractHyperlinks {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String text=scan.nextLine();
        Pattern p=Pattern.compile("(<a\\s*.+href\\s*=\\s*((\"|')*))(.*)((\"|')*)(.*)(<\\/a>)"); //TODO
        Matcher m=p.matcher(text);
    }

}
