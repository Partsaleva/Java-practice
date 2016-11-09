package h5_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11SemanticHTML {

    public static void main(String[] args) {
        String html1 = "<div style=\"color:red\" id=\"header\">\n"
                    + "</div> <!-- header -->\n" 
                    + "END";
        String html2 = "<div align=\"left\" id=\"nav\" style=\"color:blue\">\n" 
                    +  "<ul class=\"header\">\n"
                    + "<li id=\"main\">\n" 
                    + " Hi, I have id=\"main\".\n" 
                    + "</li>" + " </ul>\n"
                    + "</div> <!-- nav -->\n" 
                    + "END";
        createSemanticHtml(html1);
        createSemanticHtml(html2);
        
    }
    public static void createSemanticHtml(String html){
        Scanner scan=new Scanner(html);
        String line=null;
        Pattern newTag=Pattern.compile("id=\"(\\w+)\"");
        Pattern div=Pattern.compile("div");
        boolean NotEnd=true;
        Matcher m1=null;
        Matcher m2=null;
        StringBuilder result=new StringBuilder();
        while (NotEnd) {
            line=scan.nextLine();
            if(line.equals("END"))
                NotEnd=false;            
            m1=newTag.matcher(line);
            m2=div.matcher(line);
            
        }
        System.out.println(result);
        scan.close(); 
    }
}
