import java.util.Arrays;
import java.util.List;

public class Problem54 {

    public static void main(String[] args) {
        List<String> cardValues=
                Arrays.asList("2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,"J" ,"Q" ,"K" ,"A");
        

    }

    private static int highCard(){
        return 0; //Highest value card.
    
    }
    private static int onePair(){
        return 0;//Two cards of the same value.
        
    }
    private static int twoPairs(){//Two different pairs.
        return 0;
    }
    private static int threeOfAKind(){//Three cards of the same value.
        return 0;
    }
    private static int straight(){//All cards are consecutive values.
        return 0;
    }
    private static int flush(){//All cards of the same suit.
        return 0;
    }
    private static int fullHouse(){//Three of a kind and a pair.
        return 0;
    }
    private static int fourOfAKind(){//Four cards of the same value.
        return 0;
    }
    private static int straightFlush(){// All cards are consecutive values of same suit.
        return 0;
    }
    private static int royalFlush(){ //Ten, Jack, Queen, King, Ace, in same suit.
        return 0;
    }
    
}
