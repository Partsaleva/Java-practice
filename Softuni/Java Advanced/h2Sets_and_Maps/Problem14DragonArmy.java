package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem14DragonArmy {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        int lines=in.nextInt();
        Map<TypeOfDracon,Dracon> map=new HashMap<>();
        String[] input=null;
        for (int i = 0; i < lines; i++) {
            input=scan.nextLine().split(" ");
            TypeOfDracon type=new TypeOfDracon(input[0]);
            Dracon dracon=new Dracon(input[1], Integer.parseInt(input[2]), 
                    Integer.parseInt(input[3]), Integer.parseInt(input[4]));
            if (map.containsKey(type)) {
               // type.setDemage(type.getDemage+ Integer.parseInt(input[2]));
              //  type.setHealth(type.getHealth()+Integer.parseInt(input[3]));
               // type.setArmor(type.getArmor() +  Integer.parseInt(input[4]));
            } 
            map.put(type, dracon);           
        }
       
        scan.close();
        in.close();

    }

    private static class TypeOfDracon{
        private String type;
        private int demage=0;
        private int health=0;
        private int armor=0;
        public TypeOfDracon(String type) {
            this.type = type;
        }
        //TODO typeOfDracon to contain list of dracons
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((type == null) ? 0 : type.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            TypeOfDracon other = (TypeOfDracon) obj;
            if (type == null) {
                if (other.type != null)
                    return false;
            } else if (!type.equals(other.type))
                return false;
            return true;
        }
        
    }
    private static class Dracon{
        private String name;
        private int demage=45;
        private int health=250;
        private int armor=10;
        public Dracon(String name, int demage, int health, int armor) {
            this.name = name;
            this.demage = demage;
            this.health = health;
            this.armor = armor;
        }
        @Override
        public String toString() {
            return "-" + name + "-> demage: " + demage + ", health: " + health + ", armor: " + armor;
        }      
    }
}