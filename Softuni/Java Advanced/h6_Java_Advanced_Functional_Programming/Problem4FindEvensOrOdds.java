package h6_Java_Advanced_Functional_Programming;

import java.util.Scanner;
import java.util.function.Predicate;

public class Problem4FindEvensOrOdds {

    public static void main(String[] args) {
        Integer lowerBound = 1;
        Integer upperBound = 20;
        Predicate<Integer> predicate=null;
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        switch (command) {
        case "even":
                predicate= x -> x % 2 == 0;
            break;
        case "odd":
                predicate= x -> x % 2 != 0;
            break;
        default:
            break;
        }
        for (int i = lowerBound; i <= upperBound; i++) {
            if (testNum(i, predicate)) 
                System.out.print(i + " ");
        }
        scan.close();
    }

    public static Boolean testNum(Integer number, Predicate<Integer> predicate) {
        return predicate.test(number);
    }
}
