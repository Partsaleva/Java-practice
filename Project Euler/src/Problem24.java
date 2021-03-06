import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*A permutation is an ordered arrangement of objects. For example, 3124 is 
 * one possible permutation of the digits 1, 2, 3 and 4. If all of the 
 * permutations are listed numerically or alphabetically, we call it lexicographic order. 
 * The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?*/
public class Problem24 {

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        List<Integer> result=new ArrayList<>(10);
        int numberOfRemain = 10;
        int permutaion = 1_000_000;
        int permutationStartingWithNum=0;
        int permutationHolder=0;
        while(numberOfRemain > 0){
            permutationHolder=factorial(numberOfRemain - 1);
            permutationStartingWithNum=permutationHolder;
            for (int i = 0; i < numbers.size(); i++) {
                if (permutationStartingWithNum >= permutaion) {
                    result.add(numbers.get(i));
                    numbers.remove(i);
                    permutationStartingWithNum-=permutationHolder;
                    break;
                }
                else {
                    permutationStartingWithNum+=permutationHolder;
                }
            }
            permutaion-=permutationStartingWithNum;
            numberOfRemain--;
        }

        System.out.println(result);
    }

    private static int factorial(int num){
        if (num<2) {
            return 1;
        }
        return num * factorial(num-1);
    }
}
