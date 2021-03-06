package examProblems;

//Problem 2
public class Problem2SumCards {

    public static void main(String[] args) {
        String input="2C 2H 2D AS 10H 10C 2S KD";
        System.out.println(sumOfCards(input));
        input="AS KH 10C";
        System.out.println(sumOfCards(input));
        input ="2S 2C 2D 2H";
        System.out.println(sumOfCards(input));
        input ="AS 10C KS KH KD 9H JH QS 3H QD QH 8S 10D 10S 7C JD";
        System.out.println(sumOfCards(input));

    }

    public static int sumOfCards(String input){
        int sum=0;
        input=input.replaceAll("[SHDC]", "");
        int value=0;
        String[] cardValues=input.split(" ");
        int count=1, i=0;
        for (i = 0; i < cardValues.length-1; i++) {
            value = getValue(cardValues[i]);
            while (cardValues[i].equals(cardValues[i + 1])) {
                count++;
                if (++i == cardValues.length - 1) {
                    break;
                }
            }           
            if (count > 1) {
                value *= count;
                value *= 2;
            }
            sum += value;
            count=1;
        }
        if (count == 1 && i == cardValues.length - 1) {
            sum += getValue(cardValues[i]);
        }
        return sum;
    }
    
    private static int getValue(String num){
        try{
           return Integer.parseInt(num);
        }catch (NumberFormatException e){
            return valueOfNotNumCard(num);
        }      
    }
    
    private static int valueOfNotNumCard(String card){
        int value=0;
        switch(card){
            case "J": value= 12;
            break;
            case "Q": value= 13;
            break;
            case "K": value= 14;
            break;
            case "A": value= 15;
            break;
        }
        return value;
    }
}
