package h4_Manual_String_Processing_Exercises;

public class Problem5ConvertFromBaseNToBase10 {

    public static void main(String[] args) {
        System.out.println(convert(7,13));
        System.out.println(convert(3,12201));
        System.out.println(convert(5,443));
        System.out.println(convert(4,33220));
        System.out.println(convert(9,4704));
    }

    public static int convert(int base, int numb){
        int result=0;
        String number=String.valueOf(numb);
        String SYMBOLS = "0123456789ABCDEF";
        int position = number.length(); 
        for (char ch : number.toCharArray()){
            int value = SYMBOLS.indexOf(ch);
            result += value*Math.pow(base,--position);
        }
        return result;
    }
}
