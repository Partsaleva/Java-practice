package h4_Manual_String_Processing_Exercises;

public class Problem2StringLength {

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        if (str.length()<=20) {
            for (int i = str.length(); i < 20; i++) {
                str.append("*");
            }
        }
        System.out.println(str);
    }

}
