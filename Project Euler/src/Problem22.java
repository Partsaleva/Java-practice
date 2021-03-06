import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Using names.txt (right click and 'Save Link/Target As...'), a 46K text file 
  containing over five-thousand first names, begin by sorting it into 
  alphabetical order. Then working out the alphabetical value for each name, 
  multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is 
worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?*/
public class Problem22 {

    public static void main(String[] args) {
        try {
            System.out.println(totalOfNameScores());
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static long totalOfNameScores() throws IOException{
        long sum=0;
        List<String> listOfNames=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("names.txt"))){
            String line=br.readLine();
            String[] names= line.split(",");
            for (String name : names) {
                listOfNames.add(name.substring(1,name.length()-1));
            }         
        }
        Collections.sort(listOfNames);
        Map<Character,Integer> lettersValues=valuesOfLetters();
        
        for (int i = 0; i < listOfNames.size(); i++) {
            sum+= (i+1) * scoreOfName(listOfNames.get(i), lettersValues);
        }
        return sum;
    }

    private static int scoreOfName(String name, Map<Character,Integer> lettersValues){
        int sum=0;
        for (int i = 0; i < name.length(); i++) {
            sum+= lettersValues.get(name.charAt(i));
        }
        return sum;                    
    }
    
    private static Map<Character, Integer> valuesOfLetters(){
        List<Character> letters=Arrays.asList(
                new Character[]{'A','B','C','D','E','F','G','H','I','J', 
                                'K','L','M','N','O','P','Q','R','S','T',
                                'U','V','W','X','Y','Z'});
        Map<Character,Integer> lettersValues=new HashMap<>();
        for (int i = 0; i < letters.size(); i++) {
            lettersValues.put(letters.get(i), i+1);
        }
        return lettersValues;
    }
}
