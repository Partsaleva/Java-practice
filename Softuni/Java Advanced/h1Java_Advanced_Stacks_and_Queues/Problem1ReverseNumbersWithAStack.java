package h1Java_Advanced_Stacks_and_Queues;

import java.util.Stack;

/*Write a program that reads N integers from the console
 *  and reverses them using a stack. Use the Stack<Integer> class. 
 *  Just put the input numbers in the stack and pop them. Examples:*/
public class Problem1ReverseNumbersWithAStack {
    public static void main(String[] args) {
        String nums="1 2 3 4 5";
        Stack<Integer> s=new Stack<>();
        for (String num : nums.split(" ")) {
            s.push(Integer.parseInt(num));
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
            System.out.print(" ");
        }        
    }   
}
