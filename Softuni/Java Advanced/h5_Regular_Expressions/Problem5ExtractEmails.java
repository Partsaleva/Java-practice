package h5_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5ExtractEmails {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=null;
        Pattern p=Pattern.compile("\\b[a-z]+(\\.|_|-)?[a-z]+@[a-z]+(\\.|_|-)?[a-z]+(\\.|_|-)?[a-z]+\\.[a-z]+");
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
