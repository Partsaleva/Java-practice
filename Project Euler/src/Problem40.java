/*An irrational decimal fraction is created by concatenating the positive integers:
0.123456789101112131415161718192021...
It can be seen that the 12th digit of the fractional part is 1.
If dn represents the nth digit of the fractional part, find the value of the following expression.
d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000*/
public class Problem40 {

    public static void main(String[] args) {
        int index = 0, d1 = 1, d10 = 1;

        int d100 = (100 - 9) / 2 + 9;
        index = (100 - 9) % 2;
        d100 = Integer.toString(d100).charAt(index - 1) - '0';

        int d1000 = (1000 - 189) / 3 + 99;
        index = (1000 - 189) % 3;
        d1000 = Integer.toString(d1000).charAt(index - 1) - '0';

        int d10000 = (10000 - 2889) / 4 + 999;
        index = (10000 - 2889) % 4;
        d10000 = Integer.toString(d10000).charAt(index - 1) - '0';

        int d100000 = (100000 - 38889) / 5 + 9999;
        index = (100000 - 38889) % 5;
        d100000 = Integer.toString(d100000).charAt(index - 1) - '0';

        int d1000000 = (1000000 - 488889) / 6 + 99999;
        index = (1000000 - 488889) % 6;
        d1000000 = Integer.toString(d1000000).charAt(index - 1) - '0';

        System.out.println(d1 * d10 * d100 * d1000 * d10000 * d100000 * d1000000);
    }

    
}
