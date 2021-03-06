package h1Java_Advanced_Stacks_and_Queues;

import java.util.Stack;

/*Play around with a stack. You will be given an integer N representing 
 the amount of elements to push onto the stack, an integer S representing
 the amount of elements to pop from the stack and finally an integer X, 
 an element that you should check whether is present in the stack. If it 
 is print true on the console, if it’s not print the smallest element 
 currently present in the stack.
Input Format: On the first line you will be given N, S and X separated by 
a single space. On the next line you will be given N amount of integers.
Output Format: On a single line print either true if X is present in the 
stack otherwise print smallest element in the stack. If the stack is empty print 0.*/
public class Problem2BasicStackOperations {

    public static void main(String[] args) {
        String conditions="5 2 13";
        String numbers ="1 13 45 32 4";
        System.out.println(checkIfPresentAfterPop(conditions, numbers));
        conditions="4 1 666";
        numbers ="420 69 13 666";
        System.out.println(checkIfPresentAfterPop(conditions, numbers));
    }
    
    public static boolean checkIfPresentAfterPop(String conditions, String numbers){
        String[] cond=conditions.split(" ");  
        Stack<Integer> stack=new Stack<Integer>();
        int num=Integer.parseInt(cond[0]);
        int pops=Integer.parseInt(cond[1]);
        int numberToSearch=Integer.parseInt(cond[2]);
        
        for (int i = 0; i < num; i++) {
            stack.push(Integer.parseInt(numbers.split(" ")[i]));
        }
        for (int i = 0; i < pops; i++) {
            stack.pop();
        }
        return search(stack, numberToSearch);
    }
    
    private static boolean search(Stack<Integer> stack, int number){
        while(!stack.empty()) {
            int num=stack.pop();
            if (num==number) {
                return true;
            }
        }
        return false;       
    }
}
