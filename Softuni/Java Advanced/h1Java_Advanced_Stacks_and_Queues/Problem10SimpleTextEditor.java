package h1Java_Advanced_Stacks_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class Problem10SimpleTextEditor {
    public static void main(String[] args) {
        String text="";
        Stack<String> textArchive=new Stack<>();
        Scanner n=new Scanner(System.in);
        Scanner command=new Scanner(System.in);
        int numberOfCommands=n.nextInt();
        String query=null;
        for (int i = 0; i < numberOfCommands; i++) {
            query=command.nextLine();
            if (query.charAt(0)=='1') {
                text+=query.split(" ")[1];
                textArchive.push(text);  
            }
            if (query.charAt(0)=='2') {
                int count=Integer.parseInt(query.split(" ")[1]);
                text=text.substring(0, text.length()-count);
                textArchive.push(text); 
            }
            if (query.charAt(0)=='3') {
                int index=Integer.parseInt(query.split(" ")[1]);
                System.out.println(text.charAt(index-1)); //index+1
            }
            if (query.charAt(0)=='4') {
                textArchive.pop();
            }
        }
        n.close();
        command.close();
    }
}
