package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem12LegendaryFarming {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<String, Integer> keyMaterials=new HashMap<>();
        Map<String, Integer> junk=new TreeMap<>();
        String[] input=null;
//        Shadowmourne – requires 250 Shards;
//        Valanyr – requires 250 Fragments;
//        Dragonwrath – requires 250 Motes;
        while (true) {  
            input=scan.nextLine().split(" ");
            if (input[0].equals("end")) {
                break;
            } 
            for (int i = 0; i < input.length-1; i=i+2) {
                int quantity=Integer.parseInt(input[i]);
                String material=input[i+1].toLowerCase();
                if (material.equals("shards") || 
                    material.equals("fragments") ||
                    material.equals("motes") ){
                    
                }
            }
        }
        scan.close();
    }

}
