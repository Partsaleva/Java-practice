package h4_Manual_String_Processing_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem8TextFilter {

    public static void main(String[] args) {
        List<String> filter = new ArrayList<>(Arrays.asList("Linux", "Windows"));
        String input = "It is not Linux, it is GNU/Linux. Linux is merely the kernel, "
                + "while GNU adds the functionality. Therefore we owe it to them by "
                + "calling the OS GNU/Linux! Sincerely, a Windows client";
        for (String f : filter) {
            String replacement="";
            for (int i = 0; i < f.length(); i++) {
                replacement+='*';
            }
            input=input.replaceAll(f, replacement);
        }
        System.out.println(input);
    }

}
