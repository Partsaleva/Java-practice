package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Problem9UserLogs {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String, Map<String, Integer>> map=new TreeMap<>();
        String[] input=null;
        while (true) {  
            input=scan.nextLine().split(" ");
            if (input[0].equals("end")) {
                break;
            } 
            Map<String, Integer> ipAddresses=new HashMap<>();
            String key=input[2].split("=")[1];
            String ip=input[0].split("=")[1];
            int count=1;
            if (map.containsKey(key)) {
                ipAddresses=map.get(key);              
                if (ipAddresses.containsKey(ip)) {
                    count=ipAddresses.get(ip);
                    ipAddresses.put(ip, count+1); 
                }else{
                    ipAddresses.put(ip, count); 
                }
            }    
            else {
                ipAddresses.put(ip, count);
                map.put(key, ipAddresses);
            }
      
        }
       
        for (Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":");
            Map<String, Integer> m =entry.getValue();
            for (Entry<String, Integer> ent : m.entrySet()){
                System.out.println(ent.getKey()+" => "+ent.getValue());
            }
        }
        scan.close();
    }
 }

