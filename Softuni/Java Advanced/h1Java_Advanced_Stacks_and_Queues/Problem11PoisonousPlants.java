package h1Java_Advanced_Stacks_and_Queues;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Problem11PoisonousPlants {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> plants=new CopyOnWriteArrayList<Integer>(Arrays.asList(6, 5, 8, 4, 7, 10, 9));
        boolean dying=true; int days=0;
        while (dying) {
            dying=false;
            for (int i = plants.size()-1; i > 0; i--) {
                if (plants.get(i)>plants.get(i-1)) { 
                    plants.remove(i);
                    dying=true;
                }                
            }
            if (dying) {
                days++;
            } else {
                dying=false;
            }        
        }
        System.out.println(days);
    }

}
