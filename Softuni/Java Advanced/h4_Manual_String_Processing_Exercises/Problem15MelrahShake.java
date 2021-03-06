package h4_Manual_String_Processing_Exercises;

public class Problem15MelrahShake {

    public static void main(String[] args) {
        String text="##mtm!!mm.mm*mtm.#";
        String pattern="mtm";
        shakeIt(text, pattern);
        text="astalavista baby";
        pattern="sta";
        shakeIt(text, pattern);

    }

    private static void shakeIt(String text, String pattern) {
        boolean canShake=true;
        while (canShake) {
            canShake=false;
            boolean found_first=false, found_second=false;
            String revPattern=new StringBuilder(pattern).reverse().toString();
            int indexOfFirst, indexOfLast;
            for (int i = 0; i < text.length()/2; i++) {
                indexOfFirst=text.indexOf(pattern);
                if (indexOfFirst!=-1) {
                    found_first=true;
                    break;
                }
            }
            for (int i = text.length()-1; i > text.length()/2; i--) {
                indexOfLast=text.length()-text.indexOf(revPattern);
                if (indexOfLast!=-1) {
                    found_second=true;
                    break;
                }
            }
            if (found_first && found_second) {
                text=text.replaceAll(pattern, "");
                text=text.replaceAll(revPattern, "");
                System.out.println("Shake it.");
                canShake=true;
                pattern=new StringBuilder(pattern).deleteCharAt(pattern.length()/2).toString();
            }else{
                System.out.println("No shake.");
            }           
        }
       
        
        System.out.println(text);
        System.out.println();
    }

}
