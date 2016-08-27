package h1Java_Advanced_Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem6TruckTour {

    public static void main(String[] args) {
        int n=5;
        Queue<Pump> petrol=new LinkedList<>();
//        Scanner scan=new Scanner(System.in);       
//        for (int i = 0; i < n; i++) {
//            String[] data=scan.nextLine().split(" ");
//            petrol.add(new Pump(Integer.parseInt(data[0]),Integer.parseInt(data[1])));
//        }       
//        scan.close();
       

        petrol.add(new Pump(1, 5));
        petrol.add(new Pump(10, 3));
        petrol.add(new Pump(3, 4));
        
//        petrol.add(new Pump(4, 6));
//        petrol.add(new Pump(6, 5));
//        petrol.add(new Pump(7, 3));
//        petrol.add(new Pump(4, 5));
        
        System.out.println(findCircle(petrol));
    }
    
    public static int findCircle(Queue<Pump> petrol){
        int index=1;    
        int quantity=0;
        while(!petrol.isEmpty()){
            Pump p=petrol.poll();
            if(!petrol.isEmpty()){
                Pump p1=petrol.peek();
                quantity=quantity+p.quantity;
                    if(quantity>=p1.distance){
                          quantity=quantity-p1.distance;
                        continue;
                    }
                    else{
                        index++;
                        quantity=0;
                        petrol.add(p);
                    }
            } else break;
        }
        return index;
    }
    
    static class Pump{
        int quantity;
        int distance;
        public Pump(int q,int d) {
            this.quantity=q;
            this.distance=d;
        }
    }
}
