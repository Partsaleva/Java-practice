package h2Sets_and_Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Problem8HandsOfCards {

    public static void main(String[] args) {
        Map<String, Set<String>> game=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        String[] input=null;
        while (true) {
            input=scan.nextLine().split(": ");
            if (input[0].equals("JOKER")) {
                break;
            }
            Set<String> cards=new HashSet<String>();
            if (game.containsKey(input[0])) {
                cards=game.get(input[0]);
            }           
            for (String str : input[1].split(", ")) {
                cards.add(str);
            }
            game.put(input[0], cards);
        }
        
        printResult(game);
        scan.close();
    }

    private static void printResult(Map<String, Set<String>> game) {
        for (Map.Entry<String, Set<String>> entry: game.entrySet()) {
            System.out.println(entry.getKey()+" : "+calculateValueOfCards(entry.getValue()));
        }
        
    }

    private static Integer calculateValueOfCards(Set<String> cards) {
        Map<String, Integer> values=values();
        int sum=0;
        for (String card : cards) {
            String color=card.substring(card.length()-1, card.length());
            String value=card.substring(0, card.indexOf(color));
            sum+=values.get(value)*values.get(color);
        }
        return sum;
    }
    
    private static Map<String, Integer> values(){
        Map<String, Integer> values=new HashMap<>();
        values.put("2", 2);values.put("3", 3);
        values.put("4", 4); values.put("5", 5);
        values.put("6", 6);values.put("7", 7);
        values.put("8", 8);values.put("9", 9);
        values.put("10", 10); values.put("J", 11);
        values.put("Q", 12);values.put("K", 13);
        values.put("A", 14);values.put("S", 4);
        values.put("H", 3);values.put("D", 2);
        values.put("C", 1);
        return values;        
    }
}

