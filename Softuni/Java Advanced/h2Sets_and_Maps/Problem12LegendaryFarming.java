package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem12LegendaryFarming {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();
        String[] input = null;
        String result=null;
        // Shadowmourne – requires 250 Shards;
        // Valanyr – requires 250 Fragments;
        // Dragonwrath – requires 250 Motes;
        while (true) {
            input = scan.nextLine().split(" ");
            if (input[0].equals("end")) {
                break;
            }
            for (int i = 0; i < input.length - 1; i = i + 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();
                if (keyMaterials.containsKey(material)) {
                    quantity += keyMaterials.get(material);
                    keyMaterials.put(material,quantity);
                    if (quantity >= 250) {
                        keyMaterials.put(material, quantity - 250);
                        result=material;   
                        break;
                    }
                } else {
                    if (junk.containsKey(material)) {
                        quantity+=junk.get(material);
                        junk.put(material, quantity);
                    }
                    junk.put(material, quantity);
                }
            }
        }
        printResult(result);
        for (Map.Entry<String, Integer> entry : keyMaterials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scan.close();
    }

    public static void printResult(String result){
        if (result.equals("shards"))
            System.out.println("Shadowmourne obtained!");
        if (result.equals("fragments"))
            System.out.println("Valanyr obtained!");
        if (result.equals("motes"))
            System.out.println("Dragonwrath obtained!");
    }
}
