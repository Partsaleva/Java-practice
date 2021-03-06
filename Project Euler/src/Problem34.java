/*145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
Find the sum of all numbers which are equal to the sum of the factorial of their digits.
Note: as 1! = 1 and 2! = 2 are not sums they are not included.*/
public class Problem34 {

    public static void main(String[] args) {
        int[] facts = new int[10];
        int result = 0;
        for (int i = 0; i < 10; i++) {
            facts[i] = factorial(i);
        }
        for (int i = 10; i < 50_000; i++) {
            int sumOfFactorials = 0;
            int number = i, n=0;
            while (number > 0) {
                n = number % 10;
                number /= 10;
                sumOfFactorials += facts[n];
            }

            if (sumOfFactorials == i) {
                result += i;
            }
        }
        System.out.println(result);

    }

    private static int factorial(int n){
        if (n <2) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
