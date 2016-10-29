package h5_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem7ValidUsernames {

    public static void main(String[] args) {
        String[] input="ds3bhj y1ter/wfsdg 1nh_jgf ds2c_vbg\\4htref".split("[,\\.\\/\\\\ ]");
        Pattern p=Pattern.compile("\\w+_?\\w+");
        List<String> validNames=new ArrayList<>();
        Matcher m=null;
        for (String string : input) {
            m=p.matcher(string);
            if (string.length()>3 && string.length()<30 && m.find()) {
                validNames.add(string);
            }
        }
        String str1=null, str2=null; int max=0, currentLenght=0;
        String result1=null,result2=null;
        for (int i = 0; i < validNames.size()-1; i++) {
            str1=validNames.get(i);
            str2=validNames.get(i+1);
            currentLenght=str1.length()+str2.length();
            if (currentLenght > max) {
                max=currentLenght;
                result1=str1;
                result2=str2;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
    }

}
