package h4_Manual_String_Processing_Exercises;

public class Problem14LettersChangeNumbers {

    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String text="A12b s17G";
        String[] combinations=text.split("\\s+");
       // First you start with the letter before the number. 
        //If it's Uppercase you divide the number by the letter's position in the alphabet. 
        //If it's lowercase you multiply the number with the letter's position.
        //Then you move to the letter after the number. If it's Uppercase you subtract 
        //its position from the resulted number. If it's lowercase you add its position 
        //to the resulted number.
        double sum=0;
        for (String str : combinations) {
            Character first=str.charAt(0);
            Character last=str.charAt(str.length()-1);
            int number=Integer.parseInt(str.substring(1, str.length()-1));
            if ((int)first<97) {
                // /
            }else{
                //*
            }
            if ((int)last<97) {
                // -
            }else{
                //+
            }
        }
    }

    
    
}
