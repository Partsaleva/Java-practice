package h5_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2MatchPhoneNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=null;
        Pattern p=Pattern.compile("(\\+359)( |-)2\\2\\d{3}\\2\\d{4}\\b");
        boolean NotEnd=true;
        Matcher m=null;
        while (NotEnd) {
            line=scan.nextLine();
            if(line.equals("end"))
                NotEnd=false;            
            m=p.matcher(line);
            if(m.find())
                System.out.println(m.group());
        }
        scan.close(); 
    }
}
