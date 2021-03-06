package h1Java_Advanced_Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Problem4BasicQueueOperations {

    public static void main(String[] args) {
        String conditions="5 2 32";
        String numbers ="1 13 45 32 4";
        checkIfPresentAfterDequeue(conditions, numbers);
        conditions="4 1 666";
        numbers ="666 69 13 420";
        checkIfPresentAfterDequeue(conditions, numbers);
        conditions="3 3 90";
        numbers="90 90 90";
        checkIfPresentAfterDequeue(conditions, numbers);

    }

    private static void checkIfPresentAfterDequeue(String conditions, String numbers) {
        String[] cond=conditions.split(" ");  
        Queue<Integer> queue=new LinkedList<>();
        int num=Integer.parseInt(cond[0]);
        int pops=Integer.parseInt(cond[1]);
        int numberToSearch=Integer.parseInt(cond[2]);
        
        for (int i = 0; i < num; i++) {
            queue.add(Integer.parseInt(numbers.split(" ")[i]));
        }
        for (int i = 0; i < pops; i++) {
            queue.poll();
        }
        search(queue, numberToSearch);
    }

    private static void search(Queue<Integer> queue, int numberToSearch) {
        int min = 0;
        if (!queue.isEmpty()) {
            min=queue.peek();
        }
        boolean found=false;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            if (num < min) {
                min = num;
            }
            if (num == numberToSearch) {
                found=true;
                System.out.println("true");
                break;
            }
        }
        if (!found) {
            System.out.println(min);
        }
        
    }

}
