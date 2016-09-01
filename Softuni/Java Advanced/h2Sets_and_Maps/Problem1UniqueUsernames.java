package h2Sets_and_Maps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1UniqueUsernames {

    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<String>();
        Scanner num=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        int n =num.nextInt();
        
       for (int i = 0; i < n; i++) {
           String name=str.nextLine();
           set.add(name);
       }
        num.close();
        str.close();
        for (String s : set) {
            System.out.println(s);
        }
    }

}
