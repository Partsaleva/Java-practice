import java.util.ArrayList;
import java.util.List;

/*A perfect number is a number for which the sum of its proper divisors 
is exactly equal to the number. For example, the sum of the proper divisors 
of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n 
and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
the smallest number that can be written as the sum of two 
abundant numbers is 24. By mathematical analysis, it can be shown 
that all integers greater than 28123 can be written as the sum of 
two abundant numbers. However, this upper limit cannot be reduced 
any further by analysis even though it is known that the greatest 
number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.*/
public class Problem23 {

    
    public static void main(String[] args) {
        int LIMIT=28123;
        
        List<Integer> abundantNumbers= new ArrayList<>();
        for (int i = 2; i <= LIMIT; i++) {
            if (Problem21.sumOfDividers(i) > i) { //reusing method from problem 21
                abundantNumbers.add(i);
            }
        }

        boolean[] canBeWrittenAsAbundant=new boolean[LIMIT +1];
        int sumOfAb=0;
        for (int i = 0; i < abundantNumbers.size(); i++) {
            for (int j = i; j < abundantNumbers.size(); j++) {
                sumOfAb=abundantNumbers.get(i) + abundantNumbers.get(j);
                if (sumOfAb <= LIMIT) {
                    canBeWrittenAsAbundant[sumOfAb]=true;
                }
                else{
                    break;
                }
            }
        }
        
        int result=0;
        for (int i = 0; i <= LIMIT; i++) {
            if (!canBeWrittenAsAbundant[i]) {
                result+=i;
            }
        }
        System.out.println(result);
    }

}
