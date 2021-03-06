package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem14DragonArmy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, double[]> dragonTypes=new HashMap<>();
        Map<String, TreeMap<String, int[]>> dragons=new LinkedHashMap<>();
        int defaultDemage=45;
        int defaultHealth=250;
        int defaultArmor=25;
       
        String[] input=null;
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            input=scan.nextLine().split("\\s+");
            String type=input[0];
            String dragon=input[1];
            Integer demage=input[2].equals("null") ? defaultDemage: Integer.parseInt(input[2]);
            Integer health=input[3].equals("null") ? defaultHealth: Integer.parseInt(input[3]);
            Integer armor=input[4].equals("null") ? defaultArmor: Integer.parseInt(input[4]);
            
            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
                dragonTypes.put(type, new double[3]);
            }
            if (dragons.get(type).containsKey(dragon)) {
                int[] values=dragons.get(type).get(dragon);
                dragonTypes.get(type)[0]-=values[0];
                dragonTypes.get(type)[1]-=values[1];
                dragonTypes.get(type)[2]-=values[2];
                
            }
            if (!dragons.get(type).containsKey(dragon)) {
                dragons.get(type).put(dragon, new int[3]);
            }
            dragons.get(type).get(dragon)[0]=demage;
            dragons.get(type).get(dragon)[1]=health;
            dragons.get(type).get(dragon)[2]=armor;
            
            dragonTypes.get(type)[0]+=demage;
            dragonTypes.get(type)[1]+=health;
            dragonTypes.get(type)[2]+=armor;
            
        }
        for (Map.Entry<String, TreeMap<String, int[]>> type : dragons.entrySet()) {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type.getKey(), 
                    dragonTypes.get(type.getKey())[0]/type.getValue().size(),
                    dragonTypes.get(type.getKey())[1]/type.getValue().size(),
                    dragonTypes.get(type.getKey())[2]/type.getValue().size());
            for (Map.Entry<String, int[]> dragon : type.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor:%d%n", dragon.getKey(),
                        dragon.getValue()[0], dragon.getValue()[1], dragon.getValue()[2]);
            }
        }              
        scan.close();
    }   
}
