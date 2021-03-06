package h5_Regular_Expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem9QueryMess {

    public static void main(String[] args) {
        String text="foo=%20foo&value=+val&foo+=5+%20+203\n"
                + "foo=poo%20&value=valley&dog=wow+\n"
                + "url=https://softuni.bg/trainings/coursesinstances/details/1070\n"
                + "https://softuni.bg/trainings.asp?trainer=nakov&course=oop&course=php\n"
                + "END";
        Scanner scan=new Scanner(text);
        List<String> values=null;
        Map<String, List<String>> map=new HashMap<>();
        String line=null;
        boolean NotEnd=true;
        String result="";
        while (NotEnd) {
            line=scan.nextLine();
            if(line.equals("END"))
                NotEnd=false;  
            else{
                line=line.replaceAll("%20", "").replace("+", "");
                result+=line;
                for (String pair : line.split("&")) {
                    String[] str=pair.split("=");
                    if (!map.containsKey(str[0])) {
                        values=new ArrayList<String>();
                        values.add(str[1]);
                    }else {
                        values=map.get(str[0]);
                        values.add(str[1]);
                    }
                    map.put(str[0], values);
                }
            }
        }       
        scan.close();
        System.out.println(map);
    }
}
