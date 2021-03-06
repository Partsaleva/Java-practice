package h1Java_Advanced_Stacks_and_Queues;

import java.util.Stack;

public class Problem9StackFibonacci {

    public static void main(String[] args) {
        System.out.println(calculateFibonacciWithStack(7));
        System.out.println(calculateFibonacciWithStack(15));
        System.out.println(calculateFibonacciWithStack(33));
        

    }
    public static int calculateFibonacciWithStack(int number){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(1);stack.push(1);
        for (int i = 1; i < number; i++) {
            int a=stack.pop();
            int b=stack.peek();
            stack.push(a);
            stack.push(a+b);
        }
        return stack.peek();
    }
}
