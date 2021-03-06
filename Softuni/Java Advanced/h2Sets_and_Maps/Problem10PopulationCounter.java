package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem10PopulationCounter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String, Map<String, Integer>> map=new HashMap<>();
        String[] input=null;
        while (true) {
            input=scan.nextLine().split("\\|");
            if (input[0].equals("report")) {
                break;
            } 
            Map<String, Integer> cities=new HashMap<>();
            String key=input[1];
            String city=input[0];
            int population=Integer.parseInt(input[2]);
            if (map.containsKey(key)) {
                cities=map.get(key); 
                cities.put(city, population);
            }else {
                cities.put(city, population);
                map.put(key, cities);
            }             
        }
        for (Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            int population=0;
            Map<String, Integer> m =entry.getValue();
            for (Entry<String, Integer> ent : m.entrySet()){
                population+=ent.getValue();
            }
            System.out.println(entry.getKey()+"(total population: "+population+")");
            for (Entry<String, Integer> ent : m.entrySet()){
                System.out.println(ent.getKey()+" => "+ent.getValue());
            }
        }
        scan.close();
    }

}
