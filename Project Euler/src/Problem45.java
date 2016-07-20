/*Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:

Triangle        Tn=n(n+1)/2     1, 3, 6, 10, 15, ...
Pentagonal      Pn=n(3n−1)/2        1, 5, 12, 22, 35, ...
Hexagonal       Hn=n(2n−1)      1, 6, 15, 28, 45, ...
It can be verified that T285 = P165 = H143 = 40755.

Find the next triangle number that is also pentagonal and hexagonal*/
public class Problem45 {

    public static void main(String[] args) {
        improvedSolution();
    }

    public static void improvedSolution() {
        long result = 0;
        int hexagonal = 143;       
        while (true) {
            hexagonal++;
            result = hexagonal * (2 * hexagonal - 1);        
            if (isPentagonal(result)) {
                break;
            }
        }
        System.out.println(result);
    }
    
    private static boolean isPentagonal(long number) {
        return ((Math.sqrt(1 + 24 * number) +1 )/ 6) % 1 == 0;
    }
    
    
}
