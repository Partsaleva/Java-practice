package h4_Manual_String_Processing_Exercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem7SumBigNumbers {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String f=scan.nextLine();
        String s=scan.nextLine();
        BigInteger first=new BigInteger(f);
        BigInteger second=new BigInteger(s);
        System.out.println(new BigDecimal(first.add(second)));

    }
}
