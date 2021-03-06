package h4_Manual_String_Processing_Exercises;

public class Problem14LettersChangeNumbers {

    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String text="P34562Z q2576f H456z";
        String[] combinations=text.split("\\s+");
        double sum=0;
        for (String str : combinations) {
            Character first=str.charAt(0);
            Character last=str.charAt(str.length()-1);
            int number=Integer.parseInt(str.substring(1, str.length()-1));
            if ((int)first<97) {
                first=Character.toLowerCase(first);
                sum+=number/(alphabet.indexOf(first)+1);// /
            }else{
                sum+=number*(alphabet.indexOf(first)+1);//*
            }
            if ((int)last<97) {
                last=Character.toLowerCase(last);
                sum+=number-(alphabet.indexOf(last)+1);// -
            }else{
                sum+=number+(alphabet.indexOf(last)+1);//+
            }
        }
        System.out.println(sum);
    }  
}
