package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem6AMinerTask {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        String resource=null;
        String quantity=null;
        while (true) {
            resource=scan.nextLine();
            if (resource.equals("stop"))break;           
            quantity=scan.nextLine();
            if (quantity.equals("stop")) break;           
            map.put(resource, quantity);                     
        }
        for (Map.Entry<String, String> entry:map.entrySet()) {
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }
        scan.close();

    }

}
