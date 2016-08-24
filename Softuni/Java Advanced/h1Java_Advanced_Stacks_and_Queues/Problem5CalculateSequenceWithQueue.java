package h1Java_Advanced_Stacks_and_Queues;

import java.util.ArrayDeque;

public class Problem5CalculateSequenceWithQueue {

    public static void main(String[] args) {
        int n=2;
        ArrayDeque<Integer> line=new ArrayDeque<>();
        line.addLast(n);
        for (int i = 0; i < 50; i++) {          
            int s=line.removeFirst();
            System.out.print(s +" ");
            line.addLast(s+1);
            line.addLast(2*s+1);
            line.addLast(s+2);
        }
    }

}
