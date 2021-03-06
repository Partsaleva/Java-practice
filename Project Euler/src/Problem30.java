/*Surprisingly there are only three numbers that can 
 be written as the sum of fourth powers of their digits:

1634 = 14 + 64 + 34 + 44
8208 = 84 + 24 + 04 + 84
9474 = 94 + 44 + 74 + 44
As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be 
written as the sum of fifth powers of their digits.*/
public class Problem30 {

    public static void main(String[] args) {
        int limit=(int) (6* Math.pow(9, 5));
        int sum =0;
        int number=0, digit=0, sumOfPowers=0;
        
        for (int i = 10; i < limit; i++) {
            number =i;
            while(number > 0){
                digit=number % 10;
                number/=10;
                
                sumOfPowers+=Math.pow(digit, 5);
            }
            if (i == sumOfPowers) {
                sum += i;
            }
            sumOfPowers=0;
        }
        
        System.out.println(sum);
    }

}
