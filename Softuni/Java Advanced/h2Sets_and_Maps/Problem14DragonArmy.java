package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Problem14DragonArmy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        Map<TypeOfDracon, List<Dracon>> map = new HashMap<>();
        String[] input = null;
        for (int i = 0; i < lines; i++) {
            input = scan.nextLine().split(" ");
            TypeOfDracon type = new TypeOfDracon(input[0]);
            Dracon dracon = new Dracon(input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]),
                    Integer.parseInt(input[4]));
            List<Dracon> dracons = new CopyOnWriteArrayList<>();
            if (map.containsKey(type)) {
                type.setDemage(type.getDemage() + Integer.parseInt(input[2]));
                type.setHealth(type.getHealth() + Integer.parseInt(input[3]));
                type.setArmor(type.getArmor() + Integer.parseInt(input[4]));
                dracons=map.get(type);
                if (dracons.contains(dracon)) {
                    dracons.remove(dracon);
                    dracons.add(dracon);
                } else {
                    dracons.add(dracon);
                }
            } else{
                type.setDemage(Integer.parseInt(input[2]));
                type.setHealth(Integer.parseInt(input[3]));
                type.setArmor(Integer.parseInt(input[4]));
                dracons.add(dracon);
            }
            map.put(type, dracons);
            
        }

        for (Map.Entry<TypeOfDracon, List<Dracon>> entry : map.entrySet()) {
            List<Dracon> dracons = entry.getValue();
            System.out.println(entry.getKey().type + "::(" + entry.getKey().demage / dracons.size() + "/"
                    + entry.getKey().health / dracons.size() + "/" + entry.getKey().armor / dracons.size() + ")");
            for (Dracon dracon : dracons) {
                System.out.println(dracon.toString());
            }
        }
        scan.close();
        in.close();

    }

    private static class TypeOfDracon {
        private String type;
        private int demage = 0;
        private int health = 0;
        private int armor = 0;

        public TypeOfDracon(String type) {
            this.type = type;
            setDemage(demage);
            setHealth(health);
            setArmor(armor);
        }

        public int getDemage() {
            return demage;
        }

        public void setDemage(int demage) {
            this.demage = demage;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getArmor() {
            return armor;
        }

        public void setArmor(int armor) {
            this.armor = armor;
        }

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

        @Override
        public String toString() {
            return "TypeOfDracon [type=" + type + ", demage=" + demage + ", health=" + health + ", armor=" + armor
                    + "]";
        }
        
    }

    private static class Dracon {
        private String name;
        private int demage = 45;
        private int health = 250;
        private int armor = 10;

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
