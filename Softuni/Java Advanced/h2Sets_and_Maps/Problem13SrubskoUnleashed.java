package h2Sets_and_Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Problem13SrubskoUnleashed {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Map<String, Integer>> map = new HashMap<>();
        String input = null;
        String name = "", city = "";
        int price = 0, numOfTickets = 0, total = 0;
        while (true) {
            input = scan.nextLine();
            if (input.equals("End")) {
                break;
            }
            Matcher matcher = Pattern.compile("\\w+ *[\\w+]* @\\w+ *[\\w+]*").matcher(input);
            if (matcher.find()) {
                String[] names = matcher.group().split(" @");
                name = names[0];
                city = names[1];
            }
            matcher = Pattern.compile("\\d+ \\d+").matcher(input);
            if (matcher.find()) {
                String[] nums = matcher.group().split(" ");
                price = Integer.parseInt(nums[0]);
                numOfTickets = Integer.parseInt(nums[1]);
                total = price * numOfTickets;
            }
            Map<String, Integer> singers = new HashMap<>();
            if (!map.containsKey(city)) {
                singers.put(name, total);
                map.put(city, singers);
            } else {
                singers = map.get(city);
                if (singers.containsKey(name)) {
                    total += singers.get(name);
                } else {
                    singers.put(name, total);
                }
            }
        }
        for (Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            Map<String, Integer> m = entry.getValue();
            m = sortByValue(m);
            System.out.println(entry.getKey());
            for (Entry<String, Integer> ent : m.entrySet()) {
                System.out.println("# " + ent.getKey() + " -> " + ent.getValue());
            }
        }
        scan.close();

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, 
                                Map.Entry::getValue, 
                                (e1, e2) -> e1, 
                                LinkedHashMap::new));
    }
}
