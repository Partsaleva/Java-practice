import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*The nth term of the sequence of triangle numbers is given by, 
 tn = ½n(n+1); so the first ten triangle numbers are:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
By converting each letter in a word to a number corresponding to 
its alphabetical position and adding these values we form a word value. 
For example, the word value for SKY is 19 + 11 + 25 = 55 = t10. 
If the word value is a triangle number then we shall call the word a triangle word.

Using words.txt (right click and 'Save Link/Target As...'), a 16K text file 
containing nearly two-thousand common English words, how many are triangle words?*/
public class Problem42 {

    public static void main(String[] args) {
        int count = 0;
        Map<Character, Integer> values = valuesOfLetters();
        try (BufferedReader br = new BufferedReader(new FileReader("p042_words.txt"))) {
            String allWords = br.readLine();
            String[] words = allWords.split(",");
            for (String s : words) {
                int score = scoreOfName(s.substring(1, s.length() - 1), values);
                if (((Math.sqrt(1 + 8 * score) - 1.0) / 2.0) % 1 == 0) {
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(count);
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
