package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem10PopulationCounter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String, Map<String, Integer>> map=new HashMap<>();
        String[] input=null;
        while (true) {
            input=scan.nextLine().split("|");
            if (input[0].equals("report")) {
                break;
            } 
            Map<String, Integer> cities=new LinkedHashMap<>();
            String key=input[1];
            String city=input[0];
            int population=Integer.parseInt(input[2]);
            if (map.containsKey(key)) {
                cities=map.get(key);   
                //TODO
            }    
            else {
               
            }
        }
        scan.close();
    }

}
