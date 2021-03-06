package homework5FunctionalProgrammingandStreamAPI;
import java.util.Arrays;
import java.util.List;

/*Problem 2. Sort array with stream API
Use the .sorted() method to sort an array of integers. 
The first line of input is the array. The second is the sorting order.*/
public class Problem2 {

    public static void main(String[] args) {
        List<Integer> test1=Arrays.asList(6, 8, 3, 1, 7, 2, 2, 5);
        List<Integer> test2=Arrays.asList(6, 8, 3, 1, 7, 2, 2, 5);
        test1.stream().sorted().forEach(System.out::print);
        System.out.println();
        test2.stream().sorted((n1,n2)-> n2.compareTo(n1)).forEach(System.out::print);
        
        

    }

}
