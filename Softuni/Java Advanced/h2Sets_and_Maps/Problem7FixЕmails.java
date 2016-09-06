package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem7FixЕmails {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        String name=null;
        String email=null;
        while (true) {
            name=scan.nextLine();
            if (name.equals("stop"))break;           
            email=scan.nextLine();
            if (email.equals("stop")) break; 
            if (email.endsWith("us")||email.endsWith("uk")) {
                continue;
            }else
            map.put(name, email);                     
        }
        for (Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
        scan.close();
    }
}
