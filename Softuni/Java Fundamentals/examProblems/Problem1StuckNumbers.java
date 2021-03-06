package examProblems;
import java.util.ArrayList;
import java.util.List;

public class Problem1StuckNumbers {

    public static void main(String[] args) {
        String input="2 51 1 75 25";
        compare(input);

        input="2 22 23 32 322 222 5";
        compare(input);
 
        input="5 1 20";
        compare(input);

    }

    public static void compare(String input){
        List<String> stuckNumbers=stuckNumbers(input);
        boolean found=false;
        for (int i = 0; i < stuckNumbers.size(); i++) {
            for (int j = i; j < stuckNumbers.size(); j++) {
                if (stuckNumbers.get(i).equals(stuckNumbers.get(j))) {
                    continue;
                }
                if (stuckNumbers.get(i).replace("|", "").equals(stuckNumbers.get(j).replace("|", ""))) {
                    found=true;
                    System.out.println(stuckNumbers.get(i) +" == "+ stuckNumbers.get(j));
                }
            }
        }
        if (!found) {
            System.out.println("No");
        }
        System.out.println();
    }
    public static List<String> stuckNumbers(String input){
        String[] numbers=input.split(" ");
        List<String> results=new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i]==numbers[j]){
                    continue;
                }
                results.add(numbers[i] +"|"+ numbers[j]);
            }
        }
        return results;
    }
}
