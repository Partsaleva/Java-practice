package h1Java_Advanced_Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem6TruckTour {

    public static void main(String[] args) {
        int n=3;
        int petrol=0;
        int dist=0;
        int amountOfPetrol=0;
        int distances=0;
        Queue<Integer> fuel=new LinkedList<>();
        Queue<Integer> distance=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            String[] data=scan.nextLine().split(" ");
            petrol=Integer.parseInt(data[0]);
            dist=Integer.parseInt(data[1]);
            amountOfPetrol+=petrol;
            distances+=dist;
            fuel.add(petrol); distance.add(dist);
        }
        if (distances>amountOfPetrol) {
            System.out.println("Next time");
        }else{
            for (int i = 0; i < n; i++) {
                
            }
        }
        scan.close();
    }

}
