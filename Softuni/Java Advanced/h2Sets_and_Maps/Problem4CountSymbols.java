package h2Sets_and_Maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4CountSymbols {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Map<Character, Integer> map=new TreeMap<Character, Integer>();
        String text=scan.nextLine();
        for (int i = 0; i < text.length(); i++) {
            int count=1;
            char key=text.charAt(i);
            if (map.containsKey(key)) {
                count=map.get(key);
                map.put(key, count+1);
            }else {
                map.put(key, count);
            }
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue()+" time/s");
        }
        scan.close();

    }

}
