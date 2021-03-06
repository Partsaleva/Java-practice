package h1Java_Advanced_Stacks_and_Queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem7BalancedParentheses {

    public static void main(String[] args) {
        Map<Character,Character> values=parenthesesValues();
       String input="{[()]}";
        checkIfBalanced(values, input);
        input="{[(])}";
        checkIfBalanced(values, input);
        input="{{[[(())]]}}";
        checkIfBalanced(values,input);
    }
    
    public static void checkIfBalanced(Map<Character,Character> values, String input){
        Stack<Character> parentheses =new Stack<Character>();
        parentheses.push(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            Character p=parentheses.peek();
            Character ch=input.charAt(i);
            if (ch.equals(values.get(p))) {
                parentheses.pop();
            }else {
                parentheses.push(ch);
            }
        }
        if (parentheses.isEmpty()) {
            System.out.println("YES");
        }else
            System.out.println("NO");
    }

   public static Map<Character,Character> parenthesesValues(){
        Map<Character,Character> values=new HashMap<Character, Character>();
        values.put('{', '}');
        values.put('[', ']');
        values.put('(', ')');
        return values;       
    }
}
