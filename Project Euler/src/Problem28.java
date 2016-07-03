/*Starting with the number 1 and moving to the right in a 
 * clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.
What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?*/
public class Problem28 {

    public static void main(String[] args) {
        //top-right: n^2 
        //top-left: n^2 - n + 1 
        //bottom-left: n^2 - 2n + 2 
        //bottom-right: n^2 - 3n + 3
        // sum =4n^2 -6n + 6
        long sum=1;
        for (int i = 3; i <= 1001; i+=2) {
            sum+=4*i*i - 6*i +6;
        }

        System.out.println(sum);
    }

}
