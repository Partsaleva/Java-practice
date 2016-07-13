import java.util.ArrayList;
import java.util.List;

/*If p is the perimeter of a right angle triangle with integral length sides, 
 {a,b,c}, there are exactly three solutions for p = 120.
{20,48,52}, {24,45,51}, {30,40,50}

For which value of p ≤ 1000, is the number of solutions maximised?*/
public class Problem39 {

    public static void main(String[] args) {
        // a^2 + b^2 = (p-a-b)^2 = p^2 + a^2 + b^2 -2pa – 2pb + 2ab
        //b = (p^2 -2pa) / (2p-2a)
        int max = 0, solutions = 0, limit = 0, result=0;
        for (int p = 2; p < 1000; p++) {
            solutions = 0;
            limit = p / 3;
            for (int a = 2; a < limit; a++) {
                if ((p * p - 2 * p * a) % (2 * p - 2 * a) == 0) {
                    solutions++;                  
                }
            }
            if (solutions > max) {
                max=solutions;
                result=p;
            }
        }
        
        System.out.println(result);
    }

}
