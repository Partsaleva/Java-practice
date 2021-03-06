/*It can be seen that the number, 125874, and its double, 
 251748, contain exactly the same digits, but in a different order.
Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.*/
public class Problem52 {

    public static void main(String[] args) {
        int number=1;
        boolean found=false;
        int result=0;
        while (!found) {
            number*=10;
            for (int i = number; i < number*10/6; i++) {
                found =true;
                for (int j = 2; j <=6; j++) {
                    if (!Problem49.isPermutation(i, i*j)) {
                        found=false;
                        break;
                    }
                }
                if (found) {
                    result=i;
                    break;
                }
            }
        }
        System.out.println(result);
    }

}
