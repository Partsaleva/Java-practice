package h6_Java_Advanced_Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class Problem2KnightsOfHonor {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] input=scan.nextLine().split(" ");
        Consumer<String> print = name -> System.out.println("Sir " +name);
        for (String name : input) {
            print.accept(name);
        }
        scan.close();
    }
}
