package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Problem11LogsAggregator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        int lines=in.nextInt();
        Map<String, Map<String, Integer>> map=new HashMap<>();
        String[] input=null;
        for (int i = 0; i < lines; i++) {
            input=scan.nextLine().split(" ");
            Map<String, Integer> info=new HashMap<>();
            String user=input[1];
            String ip=input[0];
            int population=Integer.parseInt(input[2]);
            if (map.containsKey(user)) {
                info=map.get(user); 
                info.put(ip, population);
            }else {
                info.put(ip, population);
                map.put(user, info);
            }             
        }
        for (Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            int time=0;
            Map<String, Integer> m =entry.getValue();
            for (Entry<String, Integer> ent : m.entrySet()){
                time+=ent.getValue();
            }
            System.out.print(entry.getKey()+": "+time);
            System.out.print("[");
            for (Entry<String, Integer> ent : m.entrySet()){
                System.out.print(ent.getKey() + " ");
            }
            System.out.println("]");
        }
        in.close();
        scan.close();
    }

}
