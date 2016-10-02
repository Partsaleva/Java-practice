package h4_Manual_String_Processing_Exercises;

public class Problem3FormattingNumbers {

    public static void main(String[] args) {
        String numbers="1013 25.3 13.4";
        String[] nums=numbers.split("\\s+");
        int first=Integer.parseInt(nums[0]);
        double second=Double.parseDouble(nums[1]);
        double third=Double.parseDouble(nums[2]);
        String hex=Integer.toHexString(first);
        int binary=Integer.parseInt(Integer.toBinaryString(first));
        System.out.print(String.format("|%-10s|%010d|%10.2f|%-10.3f|", hex,binary, second, third));
    }

}
