package h2Sets_and_Maps;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem3PeriodicTable {

    public static void main(String[] args) {        
        Scanner num=new Scanner(System.in);
        int numberOfInputs=num.nextInt();
        Set<String> set=new TreeSet<String>();       
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < numberOfInputs; i++) {
            String[] compound=scan.nextLine().split(" ");
            for (String element : compound) {
                set.add(element);
            }
        }
        num.close();
        scan.close();
        System.out.println(set);
    }

}
