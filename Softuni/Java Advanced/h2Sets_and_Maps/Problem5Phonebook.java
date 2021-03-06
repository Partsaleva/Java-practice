package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem5Phonebook {

    public static void main(String[] args) {
        Map<String, String> phonebook=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        String[] input=null;
        while (true) {
            input=scan.nextLine().split("-");
            if (input[0].equals("stop")) {
                break;
            }
            if (input.length==2) {
                phonebook.put(input[0], input[1]);
            }
            if (input.length==1) {
                if (phonebook.containsKey(input[0])) {
                    System.out.println(input[0] +" -> "+ phonebook.get(input[0]));
                }
                else{
                    System.out.println("Contact "+ input[0]+" does not exist.");
                }
            }
        }
        scan.close();
    }

}
