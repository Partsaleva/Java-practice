
public class Problem58 {

    public static void main(String[] args) {
        //top-right: n^2 
        //top-left: n^2 - n + 1 
        //bottom-left: n^2 - 2n + 2 
        //bottom-right: n^2 - 3n + 3
        int n=3, all=1;
        int countOfPrimes=0; double ratio=1;
 //FIXME
        while (ratio > 0.10 ) {
            countOfPrimes+=prime(n * n)+prime(n * n - n + 1)+prime(n * n - 2 * n + 2)+prime(n * n - 3 * n + 3);     
            n++; all+=4;
            ratio=(double)countOfPrimes/all;
            
        }
        System.out.println(all);
        
    }

    private static int prime(long number) {
        return isPrime(number) ? 1 : 0;
    }
    
    private static boolean isPrime(long number){
        if (number < 2) {
            return false;
        }
        double lim=Math.sqrt(number);
        for (int i = 2; i <= lim; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
