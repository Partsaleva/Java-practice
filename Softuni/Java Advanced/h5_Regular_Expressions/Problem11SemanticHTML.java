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
        Pattern newTag=Pattern.compile("(id=\"(\\w+)\")");
        String div="div";
        boolean NotEnd=true;
        Matcher m1=null;     
        StringBuilder result=new StringBuilder();
        String tag="";
        while (NotEnd) {
            line=scan.nextLine();
            if(line.equals("END"))
                NotEnd=false;     
            
            m1=newTag.matcher(line);
            if (m1.find() && line.contains(div)) {
                tag=m1.group(2);
                line=line.replace(div, tag);
                line=line.replace(m1.group(1),"");
                result.append(line).append("\n");
            }
            else if (line.contains(div)) {
                line=line.replace(div, tag);
                result.append(line).append("\n");
            }else
                result.append(line).append("\n");
        }
        System.out.println(result);
        scan.close(); 
    }
}
