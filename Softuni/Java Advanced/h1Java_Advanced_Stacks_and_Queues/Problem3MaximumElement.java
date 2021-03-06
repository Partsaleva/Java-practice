package h1Java_Advanced_Stacks_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Problem3MaximumElement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfQueries=scan.nextInt();
        
        Scanner queryScan = new Scanner(System.in);
        Stack<Integer> stack=new Stack();
        Stack<Integer> maxHolder=new Stack();
        String query=null; int max=0;
        for (int i = 0; i < numberOfQueries; i++) {
            query=queryScan.nextLine();
            if (query.charAt(0)=='1') {
                int num=Integer.parseInt(query.split(" ")[1]);
                stack.push(num);
                if (num>max) {
                   max=num; 
                }
                maxHolder.push(max);               
            }
            if (query.charAt(0)=='2') {
                int num=stack.pop();
                if (num==max) {
                    while (!maxHolder.empty() && num==maxHolder.peek()) {
                        maxHolder.pop();                      
                    }
                    if (!maxHolder.empty()) {
                       max=maxHolder.peek();
                    }else 
                        max=0;
                }               
            }
            if (query.charAt(0)=='3') {
                System.out.println(maxHolder.peek());
            }
        }
        queryScan.close();
        scan.close();
    }

    
}
