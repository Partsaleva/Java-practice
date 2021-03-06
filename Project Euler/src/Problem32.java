import java.util.HashSet;
import java.util.Set;

/*We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n 
 * exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, 
multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product 
identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
*/
public class Problem32 {

    public static void main(String[] args) {
     //   System.out.println(isPandigital(39, 186));
        System.out.println(sumPandigitalNumbers());

    }

    private static boolean isPandigital(int a, int b){
        String num= new StringBuilder()
        .append(Integer.toString(a))
        .append(Integer.toString(b))
        .append(Integer.toString(a*b)).toString();
        
        if (num.length()!=9) {
            return false;
        }
        for (int i = 1; i < 10; i++) {
            if (!num.contains(Integer.toString(i))){
                return false;
            }
        }
        return true;        
    }
    
    public static int sumPandigitalNumbers(){
        Set<Integer> nums=new HashSet<>();
        int start=0,end=0;
        for (int i = 2; i < 50; i++) {
            start= (i > 9) ? 123 : 1234;
            end= 10000 / i ;
            for (int j = start; j < end; j++) {
                if (isPandigital(i, j)) {
                    nums.add(i*j);
                }
            }
        }
        int sum=0; 
        for (Integer n : nums) {
            sum+=n;
        }
        return sum;
    }
}
