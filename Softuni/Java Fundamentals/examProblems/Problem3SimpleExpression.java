package examProblems;
import java.math.BigDecimal;

public class Problem3SimpleExpression {

    public static void main(String[] args) {
        String input="9876543210 + 0.987654321";
        System.out.println(solve(input));
        input="5 -33   + 12 -  55-  1  - 2+6";
        System.out.println(solve(input));
        input="1.5 + 2.5";
        System.out.println(solve(input));
        input="0.05+0.01 - 1";
        System.out.println(solve(input));
        input="1         +        2";
        System.out.println(solve(input));
       

    }

    public static BigDecimal solve(String input){
        input= input.replaceAll("\\s+", "");
        BigDecimal sum=BigDecimal.ZERO, m=BigDecimal.ZERO;   
        for (String s : input.split("\\+")) {
            String[] min=s.split("\\-");
            m=BigDecimal.valueOf(Double.parseDouble((min[0])));
            for (int i = 1; i < min.length; i++) {              
                m= m.subtract(BigDecimal.valueOf(Double.parseDouble(min[i])));
            }          
            sum=sum.add(m);
        }
        return sum;
        
    }
    
   
}
