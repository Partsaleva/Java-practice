package h4_Manual_String_Processing_Exercises;

public class Problem1ReverseString {

    public static void main(String[] args) {
        String str="This Problem again...";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if (str.length()==0) {
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
}