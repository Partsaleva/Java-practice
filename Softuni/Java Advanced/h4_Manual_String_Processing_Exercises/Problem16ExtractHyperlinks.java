package h4_Manual_String_Processing_Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
<!DOCTYPE html>
<html>
<head>
<title>Hyperlinks</title>
<link href="theme.css" rel="stylesheet" />
</head>
<body>
<ul><li><a   href="/"  id="home">Home</a></li><li>
<a class="selected" href=/courses>Courses</a></li>
<li><a href ='/forum' >Forum</a></li><li><a class="href"onclick="go()" href"#">Forum</a></li>
<li><a id="js" href ="javascript:alert('hi yo')" class="new">click</a></li>
<li><a id='nakov' href =http://www.nakov.com class='new'>nak</a></li></ul>
<a href="#empty"></a>
<a id="href">href='fake'<img src='http://abv.bg/i.gif'alt='abv'/></a>
<a href="#">&lt;a href='hello'&gt;</a>
<!-- This code is commented:<a href="#commented">commentex hyperlink</a> -->
</body>
END
*/
public class Problem16ExtractHyperlinks {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String line=null;
        Pattern p=Pattern.compile("(<a\\s*.+href\\s*=\\s*((\"|')*))(.*)((\"|')*)(.*)(<\\/a>)"); //TODO
        Matcher m=null;
        while (line!="END") {
            line=scan.nextLine();
            m=p.matcher(line);
            if(m.find())
                System.out.println(m.group());
        }
        scan.close();
    }

}
