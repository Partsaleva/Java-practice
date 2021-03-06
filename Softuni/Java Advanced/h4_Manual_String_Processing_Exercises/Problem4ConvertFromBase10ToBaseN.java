package h4_Manual_String_Processing_Exercises;

public class Problem4ConvertFromBase10ToBaseN {

    public static void main(String[] args) {
        System.out.println(convert(7,2000));
        System.out.println(convert(2,2048));
        System.out.println(convert(3,1020));

    }

    public static String convert(int base, int number){
        StringBuilder result=new StringBuilder();
        int remainder=0;
        while (number!=0) {
            remainder=number%base;
            number/=base;
            result.append(remainder);
            remainder=0;
        }
        return result.reverse().toString();
    }
}
