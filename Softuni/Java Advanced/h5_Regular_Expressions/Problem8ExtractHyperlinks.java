package h5_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8ExtractHyperlinks {

    public static void main(String[] args) {
        String htmlText=
        "<!DOCTYPE html>\n"
        + "<html>\n"
        + "<head>\n"
        + "<title>Hyperlinks</title>\n"
        + "<link href=\"theme.css\" rel=\"stylesheet\" /> </head> \n"
        + "<body>\n"
        + "<ul><li><a   href=\"/\"  id=\"home\">Home</a></li>\n"
        + "<li><a class=\"selected\" href=/courses>Courses</a>\n"
        + "</li><li><a href = '/forum' >Forum</a></li><li><a class=\"href\" onclick=\"go()\" href= \"#\">Forum</a></li>\n"
        + "<li><a id=\"js\" href = \"javascript:alert('hi yo')\" class=\"new\">click</a></li>\n"
        + "<li><a id='nakov' href = http://www.nakov.com class='new'>nak</a></li></ul>\n"
        + "<a href=\"#empty\"></a>\n"
        + "<a id=\"href\">href='fake'<img src='http://abv.bg/i.gif' alt='abv'/></a>\n"
        + "<a href=\"#\">&lt;a href='hello'&gt;</a>\n"
        + "<!-- This code is commented: <a href=\"#commented\">commentex hyperlink</a> -->\n"
        + "</body>\n"
        + "END\n";
        Scanner scan=new Scanner(htmlText);
        String line=null;
        Pattern p =Pattern.compile("<a\\s*.*?href\\s*=\\s*(\"|'|)?(.*?)\\1(.*?)(<\\/a>)");
        boolean NotEnd=true;
        Matcher m=null;
        while (NotEnd) {
            line=scan.nextLine();
            if(line.equals("END"))
                NotEnd=false;            
            m=p.matcher(line);
            if(m.find())
                System.out.println(m.group(2));
        }
        scan.close();
    }

}
